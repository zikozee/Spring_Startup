package com.zikozee.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class AssignmentApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from the spring container
        Coach theCoach = context.getBean("myAssignmentCoach", Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();
    }
}
