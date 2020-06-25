package com.learn.java.Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("adam", "Julie");
        stream.forEach(System.out::println);

        Stream.iterate(1,  x -> x * 2)
                .limit(10)
                .forEach(System.out::println);
        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
