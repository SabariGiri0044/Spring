package com.springsabu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext obj=new ClassPathXmlApplicationContext("Spring.xml");
	     Sabu obj1=(Sabu) obj.getBean("Stu1");
	     obj1.Display();
		}
	}


