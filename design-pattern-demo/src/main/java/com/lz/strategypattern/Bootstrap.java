package com.lz.strategypattern;

/**
 * 〈主启动类〉
 *
 * @author LZ
 * @create 2020/4/26
 * @since 1.0.0
 */
public class Bootstrap {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}
