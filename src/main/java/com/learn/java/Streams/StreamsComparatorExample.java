package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        sortStudentsByName().forEach(System.out::println);
    }
}
