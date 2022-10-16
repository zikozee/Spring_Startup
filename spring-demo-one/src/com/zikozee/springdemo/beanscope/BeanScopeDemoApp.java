package com.zikozee.springdemo.beanscope;

import com.zikozee.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Ezekiel Eromosei
 * @created: 16 October 2022
 */

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach2", Coach.class);

        Coach alphaCoach = context.getBean("myCoach2", Coach.class);

        // check if they are the same bean
        boolean result = (theCoach == alphaCoach);

        //print out the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        //close the context
        context.close();

    }
}
