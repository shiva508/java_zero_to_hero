package com.pool.collectors.minBy;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;

public class CollectorsMinByClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var collect = students.stream().map(Student::getFirstName).min(String::compareTo);
        System.out.println(collect);
    }
}
