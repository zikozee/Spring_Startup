package com.zikozee.springdemo.beanlifecycle;

import com.zikozee.springdemo.Coach;
import com.zikozee.springdemo.FortuneService;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class LifeCycleCoach implements Coach {

    // define a private field for teh dependency
    private FortuneService fortuneService;


    public LifeCycleCoach() {}

    public LifeCycleCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k for life";
    }

    @Override
    public String getDailyFortune() {
        return "Lifecycle: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("LifeCycleCoach: inside method doMyStartupStuff\n");
    }

    // add a destroy method
    public void doMyCleanupStuffYoyo(){
        System.out.println("\nLifeCycleCoach: inside method doMyCleanupStuffYoyo");
    }
}
