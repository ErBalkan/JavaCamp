package com.erbalkan.spring_data_jpa.webAPI.controllers.abstracts;

import com.erbalkan.spring_data_jpa.entities.Student;

public interface IStudentController {
    public Student saveStudent(Student student);
}
