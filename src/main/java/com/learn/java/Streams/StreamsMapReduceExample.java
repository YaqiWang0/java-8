package com.learn.java.Streams;

import com.learn.java.Data.Student;
import com.learn.java.Data.StudentDataBase;

public class StreamsMapReduceExample {
    private static int nonOfNoteBooks() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNodeBooks) //Stream<Integer>
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(nonOfNoteBooks());
    }
}
