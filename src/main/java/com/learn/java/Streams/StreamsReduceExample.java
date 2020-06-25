package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static int performMultiplication(List<Integer> list) {
        return list.stream()

                .reduce(1, (a, b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> list) {
        return list.stream()
                .reduce((a, b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> {
                    if(s1.getGpa() > s2.getGpa())
                        return s1;
                    else return s2;
                });
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        List<Integer> list1 = new ArrayList<>();
        System.out.println(performMultiplication(list));

        Optional<Integer> result = performMultiplicationWithoutIdentity(list);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        System.out.println(performMultiplicationWithoutIdentity(list1).isPresent());

        System.out.println(getHighestGPAStudent().get());
    }
}
