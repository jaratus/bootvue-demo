package com.hstns.uiweb.uiwebdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldUI {

	@RequestMapping("/helloUi")
	public String helloWorld(Model model) {
		
		String name = "jinan";
		int age = 22;
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "helloUi";
	}
	
	@RequestMapping("/helloUi2")
	public String helloWorld2(Model model) {
		
		String name = "jinan";
		
		model.addAttribute("name", name);
		
		return "helloUi2";
	}
}
