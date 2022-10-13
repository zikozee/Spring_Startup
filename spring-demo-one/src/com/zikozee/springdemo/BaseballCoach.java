package com.zikozee.springdemo;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend 30 mins on batting practice";
    }
}
