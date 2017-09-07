package com.demo.interfaces.impl;/*
 *-----------------------------------------------------------------------------
 * Copyright 2017 NCR Corporation
 *-----------------------------------------------------------------------------
 */

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

import com.demo.interfaces.QuadFunction;

/**
 *
 * @author km185223
 */
public class FuntionalInterfaces {

    public boolean biPredicateMethod(BiPredicate<Integer, Integer> lambda, Integer i1, Integer i2) {
        return lambda.test(i1, i2);
    }

    public void consumerMethod(Consumer<String> lambda, String i1) {
        lambda.accept(i1);
    }

    public void biConsumerMethod(BiConsumer<Integer, Integer> lambda, Integer i1, Integer i2) {
        lambda.accept(i1, i2);
    }

    public void doubleConsumerMethod(DoubleConsumer lambda, Integer i1) {
        lambda.accept(i1);
    }

    public String biFunctionMethod(BiFunction<Integer, Integer, String> lambda, Integer i1, Integer i2) {
        return lambda.apply(i1, i2);
    }

    public String quadFunctionMethod(QuadFunction<String, Double, Integer, String, String> lambda, String s1 ,Double d, Integer i, String s2) {
        return lambda.apply(s1, d, i, s2);
    }
}
