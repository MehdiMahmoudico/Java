package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Travel;
import com.example.demo.reposotory.TravelReosotory;

@Service
public class TravelService {
	
	 private TravelReosotory travelRepo;

		public TravelService(TravelReosotory travelRepo) {
			this.travelRepo = travelRepo;
		}
		
		public Travel createTravel(Travel travel) {
			return travelRepo.save(travel);
		}

		public List<Travel> findallTravels() {
			return travelRepo.findAll();
		}
		
		public Travel updateTravel(Travel travel) {
			return travelRepo.save(travel);
		}
		
		public Travel findTravel(Long id) {
			return travelRepo.findById(id).orElse(null);
		}
		
		public void deleteTravel(Long id) {
			travelRepo.deleteById(id);
		}
	
}
