package com.pool.collectors.partitioningBy;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;
import java.util.stream.Collectors;
public class CollectorsPartitioningByClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var partitioningBy = students.stream().collect(Collectors.partitioningBy(student -> student.getGender().equals("F")));
        System.out.println(partitioningBy);
    }
}
