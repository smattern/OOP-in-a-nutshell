package com.sjm.chick.domain;

/**
 * A chick.
 *
 * @author Mattern, Sebastian, 22/11/14.
 * package: com.sjm.chick.domain
 */
public class Chick {
    /** private section */
    private String name;
    private int age;

    public Chick(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        // my true age
        setMyAge();
        return age;
    }

    /**
     * Set my age :-).
     */
    private void setMyAge() {
        this.age = 5;
    }
}
