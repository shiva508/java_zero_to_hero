package com.pool.streams.findFirst;

import com.pool.StreamUtil;
import com.pool.Student;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        Optional<Student> optionalStudent = students.stream().sorted(Comparator.comparing(Student::getAge)).findFirst();
        optionalStudent.ifPresentOrElse(System.out::println,()-> new RuntimeException("Error"));
    }
}
