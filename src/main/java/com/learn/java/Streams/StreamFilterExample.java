package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                //filters and sends only the student whose gender is female
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
