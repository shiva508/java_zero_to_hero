package com.pool.collectors.counting;

import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsCountingClient {
    public static void main(String[] args) {
        List<Student> students = StreamUtil.studentsBuilder();
        var collect = students.stream().collect(Collectors.counting());
        System.out.println(collect);
    }
}
