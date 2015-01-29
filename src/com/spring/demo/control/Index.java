package com.spring.demo.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
		@Autowired  
		private  HttpServletRequest request;  
		@RequestMapping("/")
		public String index(){
			System.out.println(request.getContextPath());
			return "index/index";
		}
}
