package com.erhanbalkan.spring_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erhanbalkan.spring_rest_api.model.Employee;
import com.erhanbalkan.spring_rest_api.services.EmployeeService;

@RestController
// Bu bir controller sınıfıdır 
// ve bu sınıfın metotlarına gelen isteklerin sonucunda dönecek verilerin formatı JSON olacaktır.
@RequestMapping(path = "/rest/api/")
// Bu controller sınıfına gelen isteklerin başına "/rest/api/" eklenecektir.
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping(path = "/employee-list")
    // Bu metot, "/employee-list" adresine gelen GET isteklerini karşılar.
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmployeeList();
    }
}
