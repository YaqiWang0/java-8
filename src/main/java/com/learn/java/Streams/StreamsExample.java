package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;
import com.learn.java.FuntionalInterfaces.PredicateStudent;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);
        //student name and there activities in a map
        Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(map);
    }
}
