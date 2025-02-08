package com.erbalkan.spring_data_jpa.business.abstracts;

import com.erbalkan.spring_data_jpa.entities.Student;

public interface IStudentService {
    public Student saveStudent(Student student);
}
