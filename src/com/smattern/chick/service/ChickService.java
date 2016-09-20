package com.smattern.chick.service;

import com.smattern.chick.domain.Chick;

/**
 * Chick service layer.
 *
 * @author Mattern, Sebastian, 25/11/14.
 * package: com.smattern.chick.service
 */
public interface ChickService {

    /**
    * Create a chick;
    *
    * @param i, identifier 
    *           
    * @return chick, the new chick
    */
    Chick createChick(int i);
}
