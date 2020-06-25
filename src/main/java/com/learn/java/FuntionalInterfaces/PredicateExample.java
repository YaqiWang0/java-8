package com.learn.java.FuntionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate = i -> i%2 == 0;

    static Predicate<Integer> predicate5 = i -> i%5 == 0;

    public static void predicateAnd() {
        System.out.println(predicate.and(predicate5).test(10));
        System.out.println(predicate.and(predicate5).test(9));
    }

    public static void predicateOr() {
        System.out.println(predicate.or(predicate5).test(10));
        System.out.println(predicate.or(predicate5).test(8));
    }

    public static void predicateNegate() {
        System.out.println(predicate.or(predicate5).negate().test(10));
        System.out.println(predicate.or(predicate5).negate().test(8));
    }

    public static void main(String[] args) {

        System.out.println(predicate.test(1));

        predicateAnd();

        predicateOr();

        predicateNegate();
    }
}
