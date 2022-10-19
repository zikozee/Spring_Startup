package com.zikozee.springdemo;

import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 19 October 2022
 */

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
