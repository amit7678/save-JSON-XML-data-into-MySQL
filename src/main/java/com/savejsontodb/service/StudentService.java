package com.savejsontodb.service;
import com.savejsontodb.entity.Student;
import com.savejsontodb.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public String saveStudent(String studentDetails) {
        Student s = new Student();
        s.setStudentDetails(studentDetails);
        studentRepo.save(s);
        return "saved";
    }


}
