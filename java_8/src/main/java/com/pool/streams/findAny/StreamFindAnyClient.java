package com.pool.streams.findAny;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

import java.util.List;
import java.util.Optional;

public class StreamFindAnyClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        Optional<Student> findAny= students.stream().filter(student -> student.getGender().equals("F")).findAny();
        findAny.ifPresentOrElse(System.out::println,()->new RuntimeException("Noting found"));
    }
}
