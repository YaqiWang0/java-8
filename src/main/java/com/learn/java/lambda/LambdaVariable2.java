package com.learn.java.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {
    static int value = 4;

    public static void main(String[] args) {

        //int value = 4;

        Consumer<Integer> c1 = (i) -> {
            System.out.println(value + i);
        };

        c1.accept(4);

        Consumer<Integer> c2 = (i) -> {
            value += i;
        };

        c2.accept(1);
        System.out.println(value);
    }
}
