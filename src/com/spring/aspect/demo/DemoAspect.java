package com.spring.aspect.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {
		
		@Around("execution(* com.spring.demo.impl.DemoImpl.exec(..))")
		public Object testAround(ProceedingJoinPoint pj) throws Throwable{
			System.out.println("asdfasdf");
			Object result = pj.proceed();
			System.out.println("aaaaa");
			return pj;
		}
}
