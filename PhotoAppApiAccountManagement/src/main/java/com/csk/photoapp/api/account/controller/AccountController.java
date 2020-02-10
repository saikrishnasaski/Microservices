package com.csk.photoapp.api.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/status/check")
	public String status() {
		return "Uzumaki Naruto && Uchiha Saske" + env.getProperty("local.server.port");
	}

}
