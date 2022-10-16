package com.zikozee.springdemo;

import java.security.SecureRandom;

/**
 * @author: Ezekiel Eromosei
 * @created: 16 October 2022
 */

public class RandomFortuneService implements FortuneService{

     static String[] FORTUNE_ARRAY = new String[3];

    static {
        FORTUNE_ARRAY[0] = "Have a Good Day";
        FORTUNE_ARRAY[1] = "Have a Good Month";
        FORTUNE_ARRAY[2] = "Have a Good Year";
    }

    @Override
    public String getFortune() {
        SecureRandom random = new SecureRandom();
        int rand = random.nextInt(3);

        return FORTUNE_ARRAY[rand];
    }
}
