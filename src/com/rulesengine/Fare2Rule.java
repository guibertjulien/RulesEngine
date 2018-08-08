package com.rulesengine;

import java.util.function.Predicate;

public class Fare2Rule implements IRule {

    private final IsFare2 predicate;

    public Fare2Rule(IsFare2 predicate) {
        this.predicate = predicate;
    }

    @Override
    public double execute(Criteria criteria) {
        double result = 80;
        if (predicate.test(criteria)) {
            System.out.println("--> Fare2Rule apply");
            result = 40;
        } else {
            System.out.println("--> Fare2Rule not apply");
        }
        return result;
    }
}
