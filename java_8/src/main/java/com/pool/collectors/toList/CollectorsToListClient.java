package com.pool.collectors.toList;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToListClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var integerList = students.stream().mapToInt(Student::getAge).boxed().collect(Collectors.toList());
        integerList.forEach(System.out::println);
    }
}
