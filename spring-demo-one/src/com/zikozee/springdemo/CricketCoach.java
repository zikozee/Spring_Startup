package com.zikozee.springdemo;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    //create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-args constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling fotr 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
