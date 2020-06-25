package com.learn.java.MethodReference;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {
    static Consumer<Student> c2 = System.out::println;

    static Consumer<Student> c3 = Student::printListActivities;

    public static void main(String[] args) {

       // StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
