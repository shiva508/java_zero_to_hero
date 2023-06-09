package com.pool.streams.filter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import com.pool.StreamUtil;
import com.pool.Student;

public class StreamFilterClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        Predicate<Student> genderFilter = student -> student.getGender().equals("F");
        List<Student> filteredStudents = students.stream().filter(genderFilter).collect(Collectors.toList());
        System.out.println(filteredStudents);
    }
}
