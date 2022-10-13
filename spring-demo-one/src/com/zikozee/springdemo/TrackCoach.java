package com.zikozee.springdemo;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class TrackCoach implements Coach {

    // define a private field for teh dependency
    private FortuneService fortuneService;


    public TrackCoach() {}

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
