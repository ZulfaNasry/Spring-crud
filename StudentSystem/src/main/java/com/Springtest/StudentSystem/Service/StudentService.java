package com.Springtest.StudentSystem.Service;

import com.Springtest.StudentSystem.Model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
