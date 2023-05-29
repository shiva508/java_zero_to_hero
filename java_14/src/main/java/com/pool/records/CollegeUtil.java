package com.pool.records;

import com.pool.version8.streams.util.StreamUtil;

public class CollegeUtil {
    public static void main(String[] args) {
        var college = new College(StreamUtil.studentsBuilder());
        college.studentList().stream().peek(student -> student.setFirstName(student+"========="));
        college.studentList().forEach(System.out::println);
    }
}
