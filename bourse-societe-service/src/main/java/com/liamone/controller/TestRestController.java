package com.liamone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestRestController {
	
	@Value("${global}")
	private String value;
	
	@RequestMapping("/parameter")
	public String getParameter() {
		return value;
	}

}
