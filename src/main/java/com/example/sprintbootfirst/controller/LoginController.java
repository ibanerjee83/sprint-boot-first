package com.example.sprintbootfirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sprintbootfirst.service.LoginService;

@Controller

public class LoginController {
	
	@Autowired
	LoginService lservice;
	@RequestMapping(value="/login",method =RequestMethod.GET )
//    @ResponseBody
//	public String loginMessage(@RequestParam String name,ModelMap model) {
  	public String showLoginPage(ModelMap model) {
  
//    	System.out.println("name is"+ name);
//    	model.put("name", name);
		return "login";
	}

    @RequestMapping(value="/login",method =RequestMethod.POST ) 
 	public String loginMember(@RequestParam String name,@RequestParam String password,ModelMap model) {
    	boolean isValidUser=lservice.validUser(name, password);
 		if(!isValidUser)  {
 			model.put("errmsg", "Invalid Creadentials");
 			return "login";
 		}
//    	System.out.println("name is"+ name);
    	model.put("name", name);
		return "memberpage";
	}
    
    
}


