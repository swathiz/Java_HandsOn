package com.samples.springfeedbackdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.samples.springfeedbackdemo.entity.Feedback;
import com.samples.springfeedbackdemo.service.FeedbackService;

@Controller
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@RequestMapping("/feedback")
	public String showRegistrationPage(ModelMap model) {
		//model.addAttribute("feedbacks", feedbackService.getFeedbacks());
		return "userfeedback";
	}
	
	
	@RequestMapping(value = "/addfeedback", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("feedback") Feedback feedback, ModelMap model) {
		int id = feedbackService.save(feedback);
		model.addAttribute("result", "User feedback added successfully" );
		//model.addAttribute("users", feedbackService.getFeedbacks());
		return "userfeedback";
	}
	
	
	@RequestMapping("/allfeedbacks")
	public String getUsers(ModelMap model) {
		List<Feedback> feedbacks = feedbackService.getFeedbacks();
		model.addAttribute("feedbacks",feedbacks);
		return "displayfeedback";
	}
	
}
