package com.sjm.main;

import com.sjm.world.RealWorld;
import com.sjm.world.earth.impl.RealWorldEarthImpl;

public class Main {

    public Main(){
        RealWorld theWorld = new RealWorldEarthImpl();
        theWorld.createRealWorld();
    }

    public static void main(String[] args) {
        new Main();
    }
}
