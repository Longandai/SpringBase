package com.spring.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.demo.Demo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = "classpath:META-INF/spring/applicationContext.xml")
public class DemoTest {
	@Resource(name = "demo")
	private Demo demo;
	@Test
	public void testExec(){
		demo.exec();
		Assert.assertTrue(true);
	}
}
