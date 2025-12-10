package com.rahul.SpringPostgres.mapper;

import com.rahul.SpringPostgres.dto.Studentdto;
import com.rahul.SpringPostgres.entity.Student;

public class StudentMapper {
    public static Studentdto maptoStudentDto(Student std){
        return new Studentdto(std.getId(), std.getName(), std.getMarks());
    }
    public static Student maptoStudnet(Studentdto std){
        return new Student(std.getId(), std.getName(), std.getMarks());
    }
}
