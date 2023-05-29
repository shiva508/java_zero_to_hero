package com.pool.collectors.summingLong;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSummingLongClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var summingLong = students.stream().collect(Collectors.summingLong(Student::getAge));
        System.out.println(summingLong);
    }
}
