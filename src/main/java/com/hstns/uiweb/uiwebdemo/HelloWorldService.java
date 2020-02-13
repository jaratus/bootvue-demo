package com.hstns.uiweb.uiwebdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	@Autowired
	HelloWorldRepository repository;

	public List<String> getNames() {
		
		return repository.selectNames();
	}
	
}
