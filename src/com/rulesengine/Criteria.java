package com.rulesengine;

public class Criteria {

    private final boolean fare1;
    private final boolean fare2;

    public Criteria(boolean fare1, boolean fare2) {
        this.fare1 = fare1;
        this.fare2 = fare2;
    }

    public boolean isFare1() {
        return fare1;
    }

    public boolean isFare2() {
        return fare2;
    }
}
