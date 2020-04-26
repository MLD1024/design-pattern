package com.lz.strategypattern;

/**
 * 〈〉
 *
 * @author LZ
 * @create 2020/4/26
 * @since 1.0.0
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}

