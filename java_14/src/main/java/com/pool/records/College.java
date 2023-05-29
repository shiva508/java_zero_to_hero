package com.pool.records;
import com.pool.Student;

import java.util.List;

public record College(List<Student> studentList) {
    public College(List<Student> studentList){
        this.studentList=List.copyOf(studentList);
    }
}
