package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        List<String> studentList = StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input => Student Name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(Collectors.toList());
        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }

    public static Set<String> namesSet() {
        Set<String> studentList = StudentDataBase.getAllStudents().stream() //Stream<Student>
                //Student as an input => Student Name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(Collectors.toSet());
        return studentList;
    }

}
