package com.learn.java.Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("adam");
        name.add("jim");
        name.add("jenny");

        name.remove(0);
        System.out.println(name);

        Stream<String> stringStream = name.stream();
                stringStream.forEach(System.out::println);
    }
}
