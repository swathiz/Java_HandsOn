package com.samples.springfeedbackdemo.service;

import java.util.List;

import com.samples.springfeedbackdemo.entity.Feedback;



public interface FeedbackService {

	int save(Feedback feedback);
	
	List<Feedback> getFeedbacks();
	
}
