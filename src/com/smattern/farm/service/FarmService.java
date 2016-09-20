package com.smattern.farm.service;

/**
 * The farm service layer.
 *
 * @author Mattern, Sebastian, 24/11/14.
 * package: com.smattern.farm.service
 */
public interface FarmService {

    /**
     * Create chicks and add to farm.
     */
    void createFarmWithChicks();

    /**
     * Show the current farm.
     */
    void showFarm();

    /**
     * Two chicks.
     */
    void showTwoChicks();

    /**
     * Store the farm.
     */
    void storeFarm();
}
