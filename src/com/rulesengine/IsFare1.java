package com.rulesengine;

import java.util.function.Predicate;

public class IsFare1 implements Predicate<Criteria> {
    @Override
    public boolean test(Criteria criteria) {
        return criteria.isFare1();
    }
}
