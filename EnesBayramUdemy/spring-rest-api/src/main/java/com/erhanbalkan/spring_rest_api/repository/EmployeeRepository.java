package com.erhanbalkan.spring_rest_api.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erhanbalkan.spring_rest_api.model.Employee;

@Repository
// Bu bir repository sınıfıdır. 
public class EmployeeRepository {
    
    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList(){
        return employeeList;
    }
}
