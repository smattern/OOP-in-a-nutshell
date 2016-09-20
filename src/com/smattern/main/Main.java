package com.smattern.main;

import com.smattern.world.RealWorld;
import com.smattern.world.earth.impl.RealWorldEarthImpl;

public class Main {

    public Main(){
        RealWorld theWorld = new RealWorldEarthImpl();
        theWorld.createRealWorld();
    }

    public static void main(String[] args) {
        new Main();
    }
}
