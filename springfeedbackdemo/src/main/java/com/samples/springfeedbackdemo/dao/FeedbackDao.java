package com.samples.springfeedbackdemo.dao;

import java.util.List;

import com.samples.springfeedbackdemo.entity.Feedback;

public interface FeedbackDao {

	int create(Feedback feedback);
	
	List<Feedback> findFeedbacks();
}
	

