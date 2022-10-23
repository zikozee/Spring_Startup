package com.zikozee.springdemo.injectionannotations.constructorinjection;

import com.zikozee.springdemo.Coach;
import com.zikozee.springdemo.injectionannotations.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 19 October 2022
 */

@Component
public class FootballCoach implements Coach {
    private final FortuneService fortuneService;


    @Autowired //optional
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot Ten Shots";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
