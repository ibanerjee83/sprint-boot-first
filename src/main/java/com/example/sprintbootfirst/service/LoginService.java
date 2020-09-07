package com.example.sprintbootfirst.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean validUser(String userid,String pass) {
	 return	userid.equalsIgnoreCase("indra") && pass.equalsIgnoreCase("mypass");
	}
}
