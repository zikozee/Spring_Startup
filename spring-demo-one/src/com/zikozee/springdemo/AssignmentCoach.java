package com.zikozee.springdemo;

/**
 * @author: Ezekiel Eromosei
 * @created: 16 October 2022
 */

public class AssignmentCoach implements Coach{

    private final FortuneService fortuneService;

    public AssignmentCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Assignment Coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
