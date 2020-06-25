package com.learn.java.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         * prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of the comparator is :" + comparator.compare(3,2));

        /**
         *
         */

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of the comparator using lambda is :" + comparatorLambda.compare(3,2));

        // if is told integer, then do no t need to identify in the ()

        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);

    }
}
