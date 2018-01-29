package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.Helper.OutputHelper;

public class WebApp {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"Spring-Common.xml"});
		OutputHelper output = (OutputHelper)applicationContext.getBean("OutputHelper");
		output.generatorOutput();
	}
}
