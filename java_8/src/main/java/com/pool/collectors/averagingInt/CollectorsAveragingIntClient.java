package com.pool.collectors.averagingInt;

import com.pool.StreamUtil;
import com.pool.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveragingIntClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var averagingInt = students.stream().collect(Collectors.averagingInt(Student::getAge));
        System.out.println(averagingInt);
    }
}
