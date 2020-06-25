package com.learn.java.MethodReference;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodExample {

    static Predicate<Student> p1 = RefactorMethodExample::greaterThanGradLevel;

    public static boolean greaterThanGradLevel(Student s) {
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }
}
