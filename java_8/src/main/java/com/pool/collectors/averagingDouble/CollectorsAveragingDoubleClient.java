package com.pool.collectors.averagingDouble;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveragingDoubleClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var averagingDouble = students.stream().collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(averagingDouble);
    }
}
