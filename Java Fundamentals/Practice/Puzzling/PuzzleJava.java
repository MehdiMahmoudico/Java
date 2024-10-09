import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    Random randMachine = new Random();
    public ArrayList<Integer> getTenRolls() {
        for (int i = 0; i < 10; i++) {
            myArray.add(randMachine.nextInt(20) + 1);
        }
        return myArray;
    }
    
    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Random random = new Random();
        int randomIndex = random.nextInt(alphabet.length);
        char randomLetter = alphabet[randomIndex];
        return randomLetter;
    }
    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}
