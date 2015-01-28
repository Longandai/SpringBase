package com.spring.demo.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.demo.Demo;
//@Component("demo")
//@Scope("prototype")
public class DemoImpl implements Demo {

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("≤‚ ‘");
	}

}
