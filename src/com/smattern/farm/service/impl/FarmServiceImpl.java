package com.smattern.farm.service.impl;

import com.smattern.chick.domain.Chick;
import com.smattern.chick.service.ChickService;
import com.smattern.chick.service.impl.ChickServiceImpl;
import com.smattern.farm.datahandling.FarmDatahandling;
import com.smattern.farm.datahandling.impl.FarmDatahandlingImpl;
import com.smattern.farm.domain.Farm;
import com.smattern.farm.service.FarmService;

import java.util.logging.Logger;

/**
 * Implementation of {@link com.smattern.farm.service.FarmService}
 *
 * @author Mattern, Sebastian, 24/11/14.
 * package: com.smattern.farm.service
 */
public class FarmServiceImpl implements FarmService {

    @SuppressWarnings("UnusedDeclaration")
    private final static Logger LOGGER = Logger.getLogger(FarmServiceImpl.class.getSimpleName());

    /** the farm */
    private Farm farm;

    /** data handling farm */
    private FarmDatahandling farmDatahandling;

    /** chick service */
    private ChickService chickService;

    /** farm name*/
    private static final String SAMPLE_FARM_NAME = "WI Farm";

    /** chick nr-5 */
    private static final String CHICK_NR_FIVE = "Chick nr-5";
    /** chick nr-2 */
    private static final String CHICK_NR_TWO = "Chick nr-2";

    public FarmServiceImpl(){
        chickService = new ChickServiceImpl(); // connection to chick service layer
        farmDatahandling = new FarmDatahandlingImpl(); // connection to farm data handling
    }

    @Override
    public void createFarmWithChicks(){

        farm = new Farm();
        farm.setFarmName(SAMPLE_FARM_NAME);

        // create 10 new chicks
        for(int i = 0; i <= 9; i++){
            // farm add new chick
            farm.addChickToFarm(chickService.createChick(i));
        }// end for
    }

    @Override
    public void showFarm() {

        LOGGER.info("Hallo " + farm.getFarmName());

        for (Chick chick : farm.getFarm()) {
            LOGGER.info("I'm " + chick.getName());
        }

        LOGGER.info("Farm size: " + farm.getFarmLength());
    }

    @Override
    public void showTwoChicks() {

        Chick chickNrFive = farm.getChick(CHICK_NR_FIVE);
        Chick chickNrTwo = farm.getChick(CHICK_NR_TWO);

        LOGGER.info(chickNrFive.getName() + " ask " + chickNrTwo.getName() + " how old are you?");
        LOGGER.info(chickNrTwo.getName() + " answers! I'm " + chickNrTwo.getAge());
    }

    @Override
    public void storeFarm(){
        farmDatahandling.save(farm);
    }
}
