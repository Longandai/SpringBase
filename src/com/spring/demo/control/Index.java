package com.spring.demo.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {
		@Autowired  
		private  HttpServletRequest request;  
		@RequestMapping("/index")
		public ModelAndView index(){
			ModelAndView andView = new ModelAndView("begin");
			System.out.println(request.getContextPath());
			andView.addObject("userName", "andView");
			String testa = " Hello world";
			return andView;
		}
}
