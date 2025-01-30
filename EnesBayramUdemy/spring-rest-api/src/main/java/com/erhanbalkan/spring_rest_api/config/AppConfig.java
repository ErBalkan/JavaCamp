package com.erhanbalkan.spring_rest_api.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.erhanbalkan.spring_rest_api.model.Employee;

@Configuration
public class AppConfig {

    @Bean // Bu metot bir bean nesnesi oluşturur.
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Erhan", "Balkan"));
        employeeList.add(new Employee("2", "Büşra", "Balkan"));
        employeeList.add(new Employee("3", "Nisa", "Şengezer"));
        employeeList.add(new Employee("4", "Metin", "Şengezer"));
        employeeList.add(new Employee("5", "Celal", "Balkan"));
        return employeeList;
    }
}