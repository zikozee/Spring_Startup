package com.zikozee.springdemo.injectionannotations;

import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 23 October 2022
 */

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
