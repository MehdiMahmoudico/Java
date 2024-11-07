package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ninja;
import com.example.demo.repository.NinjaRepository;

@Service
public class NinjaService {
	
	
	private NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public List<Ninja> findAllNinjas() {
		return ninjaRepo.findAll();
	}

	public List<Ninja> findNinja(Long id) {
		return ninjaRepo.findByDojoId(id);
	}
}
