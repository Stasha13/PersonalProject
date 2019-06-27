package com.feedbackproject.selfassessment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.feedbackproject.selfassessment.models.Feedback;
import com.feedbackproject.selfassessment.repositories.FeedbackRepository;

@RestController
@RequestMapping("/api/v1/feedback")
public class Feedbackcontroller {
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@GetMapping
	public List<Feedback> list(){
		//List<Feedback> feedback= new ArrayList<>();
		return feedbackRepository.findAll();
		//return feedback;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create (@RequestBody Feedback feedback) {
		feedbackRepository.save(feedback);
	}
	
	@GetMapping("/{id}")
	public Feedback get (@PathVariable("id") long id) {
		return feedbackRepository.getOne(id);
		//return new Feedback();
	}

}

