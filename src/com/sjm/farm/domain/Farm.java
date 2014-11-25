package com.sjm.farm.domain;

import com.sjm.chick.domain.Chick;

import java.util.ArrayList;

/**
 * The farm.
 *
 * @author Mattern, Sebastian, 22/11/14.
 * package: com.sjm.chick.domain
 */
public class Farm {
    /** private section */
    private String farmName;
    private ArrayList<Chick> farm;

    public Farm(){
        farm = new ArrayList<Chick>();
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public void addChickToFarm(Chick newChick){
        farm.add(newChick);
    }

    public int getFarmLength(){
        return farm.size();
    }

    public ArrayList<Chick> getFarm(){
        return farm;
    }

    public Chick getChick(String chickName){

        Chick chickToBeSearch = null;

        for (Chick chick : farm) {
            if(chick.getName().equals(chickName))
                chickToBeSearch = chick;
        }

        return chickToBeSearch;
    }
}
