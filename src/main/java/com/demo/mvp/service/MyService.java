package com.demo.mvp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mvp.model.TrainingCenter;
import com.demo.mvp.repo.TrainingCenterRepo;

@Service
public class MyService {

	//spring ioc concept.
	@Autowired
	private TrainingCenterRepo trRepo;
	
	
	//saving the object in the database.
	
	public TrainingCenter savetraining(TrainingCenter tCenter)
	{
		tCenter.setDate(new Date());
		TrainingCenter save = trRepo.save(tCenter);
		return save;
	}

	//getting the lists of training centers ...
	
	public List<TrainingCenter> getCenters() {
		
		List<TrainingCenter> findAll = trRepo.findAll();
		return findAll;
	}
	
}
