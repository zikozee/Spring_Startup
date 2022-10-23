package com.zikozee.springdemo.injectionannotations.fieldinjection;

import com.zikozee.springdemo.Coach;
import com.zikozee.springdemo.injectionannotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 19 October 2022
 */

@Component
public class LawnTennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    //define a default constructor
    public LawnTennisCoach() {
        System.out.println("inside default constructor");
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your Lawn tennis volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
