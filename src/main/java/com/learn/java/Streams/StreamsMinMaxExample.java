package com.learn.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    public static int findMaxValue(List<Integer> list) {
        return list.stream()
                .reduce(Integer.MIN_VALUE, (x, y) -> {
                    if(x > y)
                        return x;
                    return y;
                });
    }

    public static Optional<Integer> findOptionalMaxValue(List<Integer> list) {
        return list.stream()
                .reduce((x, y) -> {
                    if(x > y)
                        return x;
                    return y;
                });
    }

    public static int findMinValue(List<Integer> list) {
        return list.stream()
                .reduce(Integer.MAX_VALUE, (x, y) -> {
                    if(x > y)
                        return y;
                    return x;
                });
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println(findMaxValue(integerList));
        System.out.println(findMinValue(integerList));
        System.out.println(findOptionalMaxValue(integerList).get());
    }
}
