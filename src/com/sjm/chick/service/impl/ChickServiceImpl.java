package com.sjm.chick.service.impl;

import com.sjm.chick.domain.Chick;
import com.sjm.chick.service.ChickService;

import java.util.Random;

/**
 * Implementation of {@link com.sjm.chick.service.ChickService}
 *
 * @author Mattern, Sebastian, 25/11/14.
 * package: com.sjm.chick.service.impl
 */
public class ChickServiceImpl implements ChickService{

    @Override
    public Chick createChick(int i) {
        int randomAge = generateRandomAge();
        return new Chick("Chick nr-" + i, randomAge);
    }

    /**
     * Generate random age, range 1 - 9
     *
     * @return age, random age
     */
    private int generateRandomAge(){
        Random rand = new Random();
        int randomNum = rand.nextInt((9 - 1) + 1) + 1;

        return randomNum;
    }
}
