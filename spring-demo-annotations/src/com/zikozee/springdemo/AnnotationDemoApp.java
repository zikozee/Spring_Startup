package com.zikozee.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Ezekiel Eromosei
 * @created: 19 October 2022
 */

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("footballCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
