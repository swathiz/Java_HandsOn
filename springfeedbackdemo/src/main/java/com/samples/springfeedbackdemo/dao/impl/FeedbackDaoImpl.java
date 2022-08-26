package com.samples.springfeedbackdemo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samples.springfeedbackdemo.dao.FeedbackDao;
import com.samples.springfeedbackdemo.entity.Feedback;

@Component
public class FeedbackDaoImpl implements FeedbackDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	

	@Override
	public List<Feedback> findFeedbacks() {
		return hibernateTemplate.loadAll(Feedback.class);
		
	}

	@Override
	public int create(Feedback feedback) {
		return (int) hibernateTemplate.save(feedback);
		
	}
	
	

}
