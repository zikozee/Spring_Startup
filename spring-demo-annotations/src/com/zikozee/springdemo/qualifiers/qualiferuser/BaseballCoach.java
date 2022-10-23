package com.zikozee.springdemo.qualifiers.qualiferuser;

import com.zikozee.springdemo.Coach;
import com.zikozee.springdemo.qualifiers.QuirkyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 23 October 2022
 */

@Component
public class BaseballCoach implements Coach {

    private final QuirkyService quirkyService;

    public BaseballCoach(@Qualifier(value = "randomFortuneService") QuirkyService quirkyService) {
        this.quirkyService = quirkyService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return quirkyService.getQuirkyPlayer();
    }
}
