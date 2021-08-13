package com.democode;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldNewController {
	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public String helloWorldNew() {
		
		return "Welcome to the New World, Hello World";
	}
}
