package com.spring.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class Login {
	@RequestMapping(method = RequestMethod.GET,value = "begin")
	public String begin(){
		System.out.println("aaaa");
		return "login/login";
	}
}
