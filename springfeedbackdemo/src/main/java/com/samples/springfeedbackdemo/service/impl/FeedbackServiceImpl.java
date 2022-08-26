package com.samples.springfeedbackdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.springfeedbackdemo.dao.FeedbackDao;
import com.samples.springfeedbackdemo.entity.Feedback;
import com.samples.springfeedbackdemo.service.FeedbackService;


@Component("feedbackService")
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	private FeedbackDao feedbackdao;

	@Override
	@Transactional
	public int save(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackdao.create(feedback);
	}

	@Override
	public List<Feedback> getFeedbacks() {
		return feedbackdao.findFeedbacks();
	}
	
	

}
