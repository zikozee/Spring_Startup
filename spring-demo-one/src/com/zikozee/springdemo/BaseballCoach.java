package com.zikozee.springdemo;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class BaseballCoach implements Coach {

    // define a private field for teh dependency
    private final FortuneService fortuneService;

    // define a constructor for the dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 mins on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneService t get a fortune
        return fortuneService.getFortune();
    }
}
