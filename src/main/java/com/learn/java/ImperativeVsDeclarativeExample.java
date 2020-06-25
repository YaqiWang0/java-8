package com.learn.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,6,7,8,8,9,10);

        /**
         * *Imperative - how style of programming
         * May have some drawbacks that when in multi-thread environment, may cause problems
         */

        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum += i;
        }
        System.out.println("Sum using Imperative Approach : " + sum);

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer integer : integerList) {
            if(!uniqueList.contains(integer)){
                uniqueList.add(integer);
            }
        }
        System.out.println("uniqueList : " + uniqueList);


        /**
         * *Declarative Style of Programming - What style of programming
         * Run as expected even in the multi-thread environment
         * just run the function
         */
       int sum1 =  IntStream.rangeClosed(0,100)
               .parallel()
               .sum();
       System.out.println("Sum using Declarative Approach : " + sum);

       List<Integer> uniqueList1 = integerList.stream()
               .distinct()
               .collect(Collectors.toList());
        System.out.println("uniqueList1 : " + uniqueList1);

    }
}
