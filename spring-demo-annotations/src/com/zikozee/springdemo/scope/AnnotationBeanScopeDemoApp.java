package com.zikozee.springdemo.scope;

import com.zikozee.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Ezekiel Eromosei
 * @created: 26 November 2022
 */

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result= theCoach == alphaCoach;

        // print out the results
        System.out.println("\n Point to the same object: " + result);

        System.out.println("\n Memory location for theCoach: " + theCoach);

        System.out.println("\n Memory location for theCoach: " + alphaCoach);

        // close the context
        context.close();

    }
}
