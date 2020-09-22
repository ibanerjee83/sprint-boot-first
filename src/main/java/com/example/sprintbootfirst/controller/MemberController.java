package com.example.sprintbootfirst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MemberController {
	
	@RequestMapping(value="/authmem",method =RequestMethod.POST ) 
//	@RequestMapping(value="/authmem",method =RequestMethod.GET ) 
 	public String authorizeMember(@RequestParam String name,@RequestParam String age,@RequestParam String address,ModelMap model) {
//	public String authorizeMember(@RequestParam String age,@RequestParam String address,ModelMap model) {
 
  //  	System.out.printf("name is"+ name,"Age is"+ age);
    	System.out.printf("Age is"+ age);
    	model.put("name",name);
    	model.put("age",age);
    	model.put("address",address);
		return "memberdata";
	}
	
}