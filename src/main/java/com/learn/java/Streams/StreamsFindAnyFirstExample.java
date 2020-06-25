package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3)
                .findFirst();
    }
    public static void main(String[] args) {
        System.out.println(findAnyStudent().get());
        System.out.println(findFirstStudent().get());
    }
}
