package com.erhanbalkan.spring_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erhanbalkan.spring_rest_api.model.Employee;
import com.erhanbalkan.spring_rest_api.services.EmployeeService;

@RestController
// Bu bir controller sınıfıdır 
// ve bu sınıfın metotlarına gelen isteklerin sonucunda dönecek verilerin formatı JSON olacaktır.
@RequestMapping(path = "/rest/api/employee")
// Bu controller sınıfına gelen isteklerin başına "/rest/api/" eklenecektir.
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping(path = "/list")
    // Bu metot, "/list" adresine gelen GET isteklerini karşılar.
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmployeeList();
    }

    @GetMapping(path = "/list/{id}")
    // http://localhost:8080/rest/api/employee/1
    // 1 numaralı çalışanın bilgilerini döner.
    // Bu metot, "/employee/{id}" adresine gelen GET isteklerini karşılar.
    // Bu metot, id parametresi alır ve bu parametreye göre ilgili çalışanın bilgilerini döner.
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id){
        // Bu metot, "/employee/{id}" adresine gelen GET isteklerini karşılar.
        // Bu metot, id parametresi alır ve bu parametreye göre ilgili çalışanın bilgilerini döner.
        // Bu metotun çalışabilmesi için id parametresinin zorunlu olması gerekmektedir.
        // @PathVariable anotasyonu ile metot parametrelerinin URL'den alınan değerlerle eşleştirilmesi sağlanır.
        return employeeService.getEmployeeById(id);
        // employeeService sınıfının getEmployeeById metotu çağrılır ve bu metotun sonucu döner.
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(
        @RequestParam(name = "firstName") String firstName,
        @RequestParam(name = "lastName") String lastName
        // Bu metot, "/with-params" adresine gelen GET isteklerini karşılar.
        // Bu metot, firstName ve lastName parametrelerini alır ve bu parametrelere göre ilgili çalışanların bilgilerini döner.
        // @RequestParam anotasyonu ile metot parametrelerinin URL'den alınan değerlerle eşleştirilmesi sağlanır.
        // Bu metotun çalışabilmesi için firstName ve lastName parametrelerinin zorunlu olması gerekmektedir.
        ){
            return employeeService.getEmployeeWithParams(firstName, lastName);

    }
}
