package com.pool.collectors.summingInt;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;
import java.util.stream.Collectors;
public class CollectorsSummingIntClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var summingInt = students.stream().collect(Collectors.summingInt(Student::getAge));
        System.out.println(summingInt);
    }
}
