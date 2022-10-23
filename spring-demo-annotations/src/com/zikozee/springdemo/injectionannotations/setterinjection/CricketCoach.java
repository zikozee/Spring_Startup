package com.zikozee.springdemo.injectionannotations.setterinjection;

import com.zikozee.springdemo.Coach;
import com.zikozee.springdemo.injectionannotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 19 October 2022
 */

@Component
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //define a default constructor
    public CricketCoach() {
        System.out.println("inside default constructor");
    }

    @Autowired // optional
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("inside setFortuneService()");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your Cricketing volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
