package com.pool.streams.distinct;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

public class StreamDistinctClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        List<String> names = students.stream().map(Student::getGender).distinct().collect(Collectors.toList());
        System.out.println(names);

        String [] nameOne={"Shiva","Satish"};
        String [] nameTwo={"Gopi","Ravi"};
        String [] nameThree={"Shiva"};
        var stringSet = Stream.of(nameOne, nameTwo, nameThree).flatMap(Arrays::stream).collect(Collectors.toSet());
        System.out.println(stringSet);
    }
}
