package com.rulesengine;

public class Fare1Rule implements IRule {

    private final IsFare1 predicate;

    public Fare1Rule(IsFare1 predicate) {
        this.predicate = predicate;
    }

    @Override
    public double execute(Criteria criteria) {
        double result = 100;
        if (predicate.test(criteria)) {
            System.out.println("--> Fare1Rule apply");
            result = 50;
        } else {
            System.out.println("--> Fare1Rule not apply");
        }
        return result;
    }
}
