package com.rulesengine;

import java.util.ArrayList;
import java.util.List;

public class FareCalculator {

    private final List<IRule> rules = new ArrayList<>();

    public FareCalculator() {
        rules.add(new Fare1Rule(new IsFare1()));
        rules.add(new Fare2Rule(new IsFare2()));
    }

    public double calculate(Criteria criteria) {
        double fare = Double.MAX_VALUE;
        for (IRule rule : rules) {
            fare = Math.min(rule.execute(criteria), fare);
        }
        return fare;
    }
}
