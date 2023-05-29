package com.pool.streams.count;

import java.util.List;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

public class StreamCountClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        int total = students.stream().mapToInt(Student::getEduLevel).sum();
        System.out.println(total);
    }
}
