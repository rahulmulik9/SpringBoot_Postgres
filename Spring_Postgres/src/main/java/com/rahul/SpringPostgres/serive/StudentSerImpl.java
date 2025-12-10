package com.rahul.SpringPostgres.serive;

import com.rahul.SpringPostgres.dto.Studentdto;
import com.rahul.SpringPostgres.entity.Student;
import com.rahul.SpringPostgres.mapper.StudentMapper;
import com.rahul.SpringPostgres.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StudentSerImpl implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public Studentdto createStudent(Studentdto studentdto) {
        Student student = StudentMapper.maptoStudnet(studentdto);
        Student savedstudent  = studentRepository.save(student);
        return StudentMapper.maptoStudentDto(savedstudent);
    }

}
