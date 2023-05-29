package com.pool.collectors.maxBy;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMaxByClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var maxAge = students.stream().map(Student::getAge).collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(maxAge);
    }
}
