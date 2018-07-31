package com.info.policy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.info.policy.dao.PolicyRepo;
import com.info.policy.model.Policy;

@Controller
public class PolicyController 
{
	@Autowired
	PolicyRepo repo;
	
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addPolicy")
	public String addPolicy(Policy policy) 
	{
		repo.save(policy);
		return "home.jsp";
	}
	
	@RequestMapping("/getPolicy")
	public ModelAndView getPolicy(@RequestParam int policyNumber) 
	{
		ModelAndView mv= new ModelAndView("showPolicy.jsp");
		Policy policy = repo.findById(policyNumber).orElse(new Policy());
		mv.addObject(policy);
		return mv;
	}
	
	@RequestMapping("/policies")
	@ResponseBody
	public List<Policy> getPolicies() 
	{
		return repo.findAll();
	}
	
	@RequestMapping("/policy/{policyNumber}")
	@ResponseBody
	public Optional<Policy> getPolicyRest(@PathVariable("policyNumber") int policyNumber) 
	{
		return repo.findById(policyNumber);
	}
	
	@RequestMapping("/deletePolicy")
	public String deletePolicy(int policyNumber) 
	{
		repo.deleteById(policyNumber);
		return "home.jsp";
	}
}
