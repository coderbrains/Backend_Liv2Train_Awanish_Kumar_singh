package com.demo.mvp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mvp.model.TrainingCenter;
import com.demo.mvp.repo.TrainingCenterRepo;

@Service
public class MyService {

	@Autowired
	private TrainingCenterRepo trRepo;
	
	public TrainingCenter savetraining(TrainingCenter tCenter)
	{
		tCenter.setDate(new Date());
		TrainingCenter save = trRepo.save(tCenter);
		return save;
	}

	public List<TrainingCenter> getCenters() {
		
		List<TrainingCenter> findAll = trRepo.findAll();
		return findAll;
	}
	
}
