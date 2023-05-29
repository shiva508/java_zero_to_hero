package com.pool.collectors.joining;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var names = students.stream().map(Student::getFirstName).collect(Collectors.joining());
        System.out.println(names);
        var nameswithcama = students.stream().map(Student::getFirstName).collect(Collectors.joining(","));
        System.out.println(nameswithcama);
        var nameswithspecial = students.stream().map(Student::getFirstName).collect(Collectors.joining("-","|","|"));
        System.out.println(nameswithspecial);
    }
}
