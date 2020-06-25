package com.learn.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> list) {
        return list.stream()
                .limit(2)
                .reduce(Integer::sum);
    }
    public static Optional<Integer> skip(List<Integer> list) {
        return list.stream()
                .skip(2)
                .reduce(Integer::sum);
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println(limit(integers).get());
        System.out.println(skip(integers).get());
    }
}
