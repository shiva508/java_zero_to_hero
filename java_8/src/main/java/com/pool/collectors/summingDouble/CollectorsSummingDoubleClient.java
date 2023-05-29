package com.pool.collectors.summingDouble;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSummingDoubleClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var summingDouble = students.stream().collect(Collectors.summingDouble(Student::getAge));
        System.out.println(summingDouble);
    }
}
