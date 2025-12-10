package com.rahul.SpringPostgres.controller;


import com.rahul.SpringPostgres.dto.Studentdto;
import com.rahul.SpringPostgres.serive.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class StudentController {
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Studentdto> createStudent(@RequestBody Studentdto studentdto){
         Studentdto studentdto1 = studentService.createStudent(studentdto);
         return new ResponseEntity<>(studentdto1, HttpStatus.CREATED);
    }
}
