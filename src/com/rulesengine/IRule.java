package com.rulesengine;

import java.util.function.Predicate;

public interface IRule {

    double execute(Criteria criteria);
}
