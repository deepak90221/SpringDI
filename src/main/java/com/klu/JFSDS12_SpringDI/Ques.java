package com.klu.JFSDS12_SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("qspconfig.xml");
		Object ob = ac.getBean("qbean");
		
		Question q = (Question)ob;
		//type caste the question
	
		System.out.println();
		q.display();
		

	}

}
