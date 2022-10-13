package com.zikozee.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class SetterDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from the spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //call our new methods to get the literal values
        System.out.println("email: "+ theCoach.getEmailAddress() );
        System.out.println("team " + theCoach.getTeam());
        // close the context
        context.close();
    }
}
