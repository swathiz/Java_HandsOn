package com.simplilearn.aadhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.aadhar.model.Aadhars;
import com.simplilearn.aadhar.repository.AadharsRepo;

@Service
public class AadharsService {
	
	@Autowired
	private AadharsRepo aadharsRepo;
	
	public Aadhars addAadhars(Aadhars aadhars)
	{
		return aadharsRepo.save(aadhars);
	}
	
	public List<Aadhars> getAllAadhars()
	{
		return aadharsRepo.findAll();
	}
	
	public List<Aadhars> getAadharByHUser(int userid)
	{
		return aadharsRepo.findByHeaduser(userid);
	}
	
	public Aadhars updateAadhars(Aadhars aadhars)
	{
		return aadharsRepo.save(aadhars);
	}
	
	public void deleteAadhars(Long id)
	{
		aadharsRepo.deleteById(id);
	}
	
	
	
	

}
