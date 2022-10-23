package com.zikozee.springdemo.qualifiers;

import com.zikozee.springdemo.injectionannotations.FortuneService;
import org.springframework.stereotype.Component;

/**
 * @author: Ezekiel Eromosei
 * @created: 23 October 2022
 */

@Component
public class DatabaseFortuneService implements QuirkyService {

    @Override
    public String getQuirkyPlayer() {
        return null;
    }
}
