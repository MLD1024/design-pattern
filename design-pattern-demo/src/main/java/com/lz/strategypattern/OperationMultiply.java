package com.lz.strategypattern;

/**
 * 〈〉
 *
 * @author LZ
 * @create 2020/4/26
 * @since 1.0.0
 */

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

