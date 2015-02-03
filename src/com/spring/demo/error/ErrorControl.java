package com.spring.demo.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorControl {
	@RequestMapping("/loginerror")
	public String loginError(){
		return "/error/loginError";
	}
}
