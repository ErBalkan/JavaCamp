package com.erbalkan.spring_data_jpa.business.concretes;

import org.springframework.stereotype.Service;

import com.erbalkan.spring_data_jpa.business.abstracts.IStudentService;
import com.erbalkan.spring_data_jpa.dataAccess.IStudentRepository;
import com.erbalkan.spring_data_jpa.entities.Student;

@Service
// Bu sınıfın bir servis olduğunu belirtir.
// Spring bu sınıfı tarayarak bu sınıfın bir servis olduğunu anlar ve bu sınıfı Spring Container'a ekler.
// Spring Container'da bu sınıfın bir nesnesi oluşturulur.
// Bu sınıfın nesnesi oluşturulduğunda bu sınıfın bir servis olduğunu anlar ve bu sınıfın bir servis olduğunu belirtir.
public class StudentService implements IStudentService{

    private IStudentRepository studentRepository;
    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

}
