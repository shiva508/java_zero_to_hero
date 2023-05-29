package com.pool.collectors.collectingAndThen;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsCollectingAndThenClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var integerSetMap = students.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet)));
        System.out.println(integerSetMap);

        Map<String, Set<Integer>> result = students.stream().collect(Collectors.groupingBy(Student::getFirstName,
                Collectors.mapping(Student::getAge,
                        Collectors.collectingAndThen(Collectors.toSet(),
                                Collections::unmodifiableSet))));
        System.out.println(result);
    }
}
