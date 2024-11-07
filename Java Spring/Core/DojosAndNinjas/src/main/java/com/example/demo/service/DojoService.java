package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Dojo;
import com.example.demo.repository.DojoRepository;

@Service
public class DojoService {

	private DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}

	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> findallDojos() {
		return dojoRepo.findAll();
	}
	
	public Dojo findDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
}
