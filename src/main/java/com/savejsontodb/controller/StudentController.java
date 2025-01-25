package com.savejsontodb.controller;

import com.savejsontodb.entity.Student;
import com.savejsontodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<String> saveStudents(@RequestBody String student){
        return ResponseEntity.ok(studentService.saveStudent(student));
    }
}
