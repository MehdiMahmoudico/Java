package com.example.demo.service;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.model.LoginUser;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
    // This method will be called from the controller
    // whenever a user submits a registration form.
    
    public User register(User newUser, BindingResult result) {
    
    	// TO-DO - Reject values or register if no errors:
        
        // Reject if email is taken (present in database)
    	if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
    		result.rejectValue("email", "Unique", "Email already in use!");
    	}      
    	// Reject if password doesn't match confirmation
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
        	result.rejectValue("confirm", "Matches", "Passwords do not match!");
        }
        // Return null if result has errors
		if (result.hasErrors()) {
			return null;
		}else {
        // Hash and set password, save user to database
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
        return userRepo.save(newUser);}
    }
    // This method will be called from the controller
    // whenever a user submits a login form.
    public User login(LoginUser newLoginObject, BindingResult result) {
        // Find user in the DB by email
        Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());

        // Reject if NOT present
        if (!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Invalid credentials!");
        } else {
            // Proceed only if user exists
            User user = potentialUser.get();

            // Reject if BCrypt password match fails
            if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
                result.rejectValue("password", "Matches", "Invalid credentials!");
            }

            // Return null if result has errors
            if (result.hasErrors()) {
                return null;
            } else {
                // Otherwise, return the user object 
                return user;
            }
        }

        // Return null if user is not found
        return null;
    }

	public User findUserById(Long id) {
		Optional<User> u = userRepo.findById(id);
		if (u.isPresent()) {
			return u.get();
		} else {
			return null;
		}
	}

}
