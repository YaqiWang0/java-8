package com.learn.java.FuntionalInterfaces;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = student -> System.out.println(student);
    static Consumer<Student> c3 = student -> System.out.print(student.getName());
    static Consumer<Student> c4 = student -> System.out.println(student.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printName() {
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        studentList.forEach(c3.andThen(c4)); //consumer chain
    }

    public static void printNameAndActivitiesWithCondition() {
        studentList.forEach((student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                c3.andThen(c4).accept(student);
            }
        }));
    }


    public static void main(String[] args) {

        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

        consumer.accept("java8");
        printNameAndActivitiesWithCondition();

    }
}
