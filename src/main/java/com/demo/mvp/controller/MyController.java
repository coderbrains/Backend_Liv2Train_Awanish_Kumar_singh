package com.demo.mvp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mvp.model.TrainingCenter;
import com.demo.mvp.response.payload.ResponseModel;
import com.demo.mvp.service.MyService;

@RestController
@Validated
@RequestMapping(path="/center")
public class MyController {

	@Autowired
	MyService myService;
	
	@PostMapping
	public  ResponseModel add(@Valid @RequestBody TrainingCenter tCenter)
	{
			TrainingCenter savetraining = myService.savetraining(tCenter);
			return new ResponseModel(0, savetraining);	
	}
	
	
	
	
}
