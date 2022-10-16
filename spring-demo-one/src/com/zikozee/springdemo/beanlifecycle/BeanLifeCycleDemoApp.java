package com.zikozee.springdemo.beanlifecycle;

import com.zikozee.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Ezekiel Eromosei
 * @created: 16 October 2022
 */

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
