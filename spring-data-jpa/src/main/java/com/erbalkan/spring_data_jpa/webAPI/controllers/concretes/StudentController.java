package com.erbalkan.spring_data_jpa.webAPI.controllers.concretes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erbalkan.spring_data_jpa.business.abstracts.IStudentService;
import com.erbalkan.spring_data_jpa.entities.Student;
import com.erbalkan.spring_data_jpa.webAPI.controllers.abstracts.IStudentController;

@RestController
@RequestMapping("rest/api/student")
public class StudentController implements IStudentController{

    private IStudentService studentService;
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

}
