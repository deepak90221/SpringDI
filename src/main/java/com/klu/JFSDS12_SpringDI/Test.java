package com.klu.JFSDS12_SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        Object ob = ac.getBean("stdbean");
        
        Student std = (Student) ob;
        
        System.out.println(std.getSid() + " " + std.getSname() + " " + std.getSfee());
    }
}
