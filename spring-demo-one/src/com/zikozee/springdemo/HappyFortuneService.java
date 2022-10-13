package com.zikozee.springdemo;

/**
 * @author: Ezekiel Eromosei
 * @created: 13 October 2022
 */

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
