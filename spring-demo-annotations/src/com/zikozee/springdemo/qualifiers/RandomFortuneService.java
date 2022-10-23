package com.zikozee.springdemo.qualifiers;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

/**
 * @author: Ezekiel Eromosei
 * @created: 23 October 2022
 */

@Component
public class RandomFortuneService implements QuirkyService {

    private static final String[] DATA;

    static {
        DATA = new String[]
                {
                        "Beware of the wolf in sheep's clothing",
                        "Diligence is the mother of good luck",
                        "The journey is the reward"
                };
    }

    private final SecureRandom myRandom = new SecureRandom();

    @Override
    public String getQuirkyPlayer() {

        int index = myRandom.nextInt(DATA.length);
        return DATA[index];
    }
}
