package com.pool.collectors.groupingBy;

import com.pool.StreamUtil;
import com.pool.Student;
import com.pool.StudentModel;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsGroupingByClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        mapByGender(students);
        System.out.println("<======================================================================>");
        groupByCounting(students);
        System.out.println("<======================================================================>");
        groupBySummingInt(students);
        System.out.println("<======================================================================>");
        var stringSetMap = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.mapping(StudentModel::new, Collectors.toSet())));
        System.out.println(stringSetMap);
    }

    private static void groupBySummingInt(List<Student> students) {
        var mapSummingInt = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.summingInt(Student::getAge)));
        System.out.println(mapSummingInt);
    }

    private static void groupByCounting(List<Student> students) {
        var counting = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(counting);
    }

    private static void mapByGender(List<Student> students) {
        var integerSetMap = students.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.toSet()));
        System.out.println(integerSetMap);
    }
}
