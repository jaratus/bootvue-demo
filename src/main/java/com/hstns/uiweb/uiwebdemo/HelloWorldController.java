package com.hstns.uiweb.uiwebdemo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	HelloWorldService service;

	@RequestMapping("/hello")
	public List<String> helloWorld(@RequestParam String searchName) {
		
		List<String> names = service.getNames().stream()
				.filter(p -> p.equals(searchName))
				.collect(Collectors.toList());
		
		return names;
	}
}
