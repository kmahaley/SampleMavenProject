package com.demo.interfaces;/*
 *-----------------------------------------------------------------------------
 * Copyright 2017 NCR Corporation
 *-----------------------------------------------------------------------------
 */


/**
 * Function that takes 4 arguments and returns result
 *
 * @author kartik m
 */
@FunctionalInterface
public interface QuadFunction<T, U, V, W, R>{
    R apply(T t, U u ,V v ,W w);
}