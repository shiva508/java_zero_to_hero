package com.pool.collectors.mapping;

import com.pool.Role;
import com.pool.StreamUtil;
import com.pool.Student;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMappingClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var mapData = students.stream().collect(Collectors.groupingBy(Student::getLastName, Collectors.mapping(Student::getFirstName, Collectors.toSet())));
        System.out.println(mapData);
        var stringSetMap = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName,
                        Collectors.flatMapping(student -> student.getRoles()
                                .stream().map(Role::getRoleName).collect(Collectors.toSet())
                                .stream(), Collectors.toSet())));
        System.out.println(stringSetMap);
    }
}
