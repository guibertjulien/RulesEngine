package com.rulesengine;

import java.util.function.Predicate;

public class IsFare2 implements Predicate<Criteria> {
    @Override
    public boolean test(Criteria criteria) {
        return criteria.isFare2();
    }
}
