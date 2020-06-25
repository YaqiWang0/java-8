package com.learn.java.FuntionalInterfaces;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " +activities);

    static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    static Consumer<Student> studentConsumer = (student) -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };


    public static void printNameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        printNameAndActivities();
    }
}
