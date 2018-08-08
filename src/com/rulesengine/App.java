package com.rulesengine;

public class App {

    public static void main(String[] args) {
        final FareCalculator fareCalculator = new FareCalculator();
        final Criteria criteria = new Criteria(true, false);
        double calculate = fareCalculator.calculate(criteria);
        System.out.println("==> result: " + calculate);
    }
}
