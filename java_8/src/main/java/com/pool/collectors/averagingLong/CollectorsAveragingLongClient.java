package com.pool.collectors.averagingLong;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAveragingLongClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var averagingLong = students.stream().collect(Collectors.averagingLong(Student::getAge));
        System.out.println(averagingLong);
    }
}
