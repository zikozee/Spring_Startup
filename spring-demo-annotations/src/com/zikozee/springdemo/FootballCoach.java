package com.zikozee.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 19 October 2022
 */

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Shoot Ten Shots";
    }
}
