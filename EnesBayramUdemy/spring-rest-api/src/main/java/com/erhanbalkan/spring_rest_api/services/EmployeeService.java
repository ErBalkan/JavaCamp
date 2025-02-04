package com.erhanbalkan.spring_rest_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erhanbalkan.spring_rest_api.model.Employee;
import com.erhanbalkan.spring_rest_api.repository.EmployeeRepository;

@Service
// Bu bir servis sınıfıdır. Bu sınıfın bir servis 
// sınıfı olduğunu belirtmek için @Service anotasyonu kullanılır.
public class EmployeeService {

    @Autowired 
    // Bu anotasyon ile bir sınıfın başka bir sınıfı kullanabilmesi sağlanır.
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList(){
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmployeeById(String id){
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeeWithParams(String firstName, String lastName){
        return employeeRepository.getEmployeeWithParams(firstName, lastName);
    }
}
