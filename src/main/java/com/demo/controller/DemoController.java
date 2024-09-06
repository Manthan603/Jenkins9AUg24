package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	@RequestMapping("/hi")
	public String getHi()
	{
		return "<h1>hi</h1>";
	}
}
