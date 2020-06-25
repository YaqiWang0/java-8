package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());



        return studentActivities;
    }

    public static long numberOfStudentActivities() {
        long numberOfStudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .count();
        return numberOfStudentActivities;
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(numberOfStudentActivities());
    }
}
