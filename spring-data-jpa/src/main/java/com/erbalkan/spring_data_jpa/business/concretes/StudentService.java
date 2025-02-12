package com.erbalkan.spring_data_jpa.business.concretes;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
       }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent()){
            // Veri varsa anlamında ispresent
            return optional.get();
        }
        return null;
    }

    @Override
    public void deleteStudent(Integer id) {
        Student dbStudent = getStudentById(id);
        if(dbStudent != null){
            studentRepository.delete(dbStudent);
        }
    }

    @Override
    public Student updateStudent(Integer id, Student updateStudent) {
        Student dbStudent = getStudentById(id);
        if(dbStudent != null){
            dbStudent.setFirstName(updateStudent.getFirstName());
            dbStudent.setLastName(updateStudent.getLastName());
            dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
            
            return studentRepository.save(dbStudent);
        }
        return null;
    }

}
