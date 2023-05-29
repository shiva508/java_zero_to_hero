package com.pool.streams.sorted;

import com.pool.version8.streams.util.Role;
import com.pool.version8.streams.util.StreamUtil;
import com.pool.version8.streams.util.Student;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSortedClient {
    public static void main(String[] args) {
        List<Role> roles = StreamUtil.rolesBuilder();
        var collect = roles.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect);

        List<Student> students=StreamUtil.studentsBuilder();
        var collect1 = students.stream().sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(collect1);
    }
}
