package com.pool.streams.min;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMinClient {
    public static void main(String[] args) {
        String[] inputData = {"aaaa", "aaa", "a", "aaaaa"};
        var min = Arrays.stream(inputData).min(Comparator.comparingInt(String::length)).orElseGet(String::new);
        System.out.println(min);
        List<Student> students = StreamUtil.studentsBuilder();
        var get = students.stream().map(Student::getFirstName).toList().stream().min(Comparator.comparing(String::length)).orElseGet(String::new);
        System.out.println(get);
    }
}
