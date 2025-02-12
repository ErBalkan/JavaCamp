package com.erbalkan.spring_data_jpa.webAPI.controllers.abstracts;

import java.util.List;

import com.erbalkan.spring_data_jpa.entities.Student;

public interface IStudentController {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Integer id); 
    public void deleteStudent(Integer id);
    public Student updateStudent(Integer id, Student updateStudent);
}
