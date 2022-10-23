package com.zikozee.springdemo.qualifiers;

import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 23 October 2022
 */

@Component
public class RestFortuneService implements QuirkyService {


    @Override
    public String getQuirkyPlayer() {
        return null;
    }
}
