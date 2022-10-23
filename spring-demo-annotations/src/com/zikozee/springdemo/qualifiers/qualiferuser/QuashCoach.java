package com.zikozee.springdemo.qualifiers.qualiferuser;

import com.zikozee.springdemo.Coach;
import com.zikozee.springdemo.qualifiers.QuirkyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 23 October 2022
 */

@Component
public class QuashCoach implements Coach {

    private QuirkyService quirkyService;


    @Autowired
//    @Qualifier(value = "randomFortuneService")
    public void setQuirkyService(@Qualifier(value = "randomFortuneService")QuirkyService quirkyService) {
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
