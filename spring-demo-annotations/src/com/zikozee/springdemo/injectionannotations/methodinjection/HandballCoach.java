package com.zikozee.springdemo.injectionannotations.methodinjection;

import com.zikozee.springdemo.Coach;
import com.zikozee.springdemo.injectionannotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 19 October 2022
 */

@Component
public class HandballCoach implements Coach {

    private FortuneService fortuneService;

    //define a default constructor
    public HandballCoach() {
        System.out.println("inside default constructor");
    }

    @Autowired // optional
    public void doCrazyStuff(FortuneService fortuneService){
        System.out.println("inside doCrazyStuff()");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your Handball volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
