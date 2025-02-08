package com.erbalkan.spring_data_jpa.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erbalkan.spring_data_jpa.entities.Student;


@Repository
// Bu sınıfın bir repository olduğunu belirtmek için @Repository anotasyonu kullanılır.
// JpaRepository interface'inden türetilir ve bu interface, Student entity'si için CRUD işlemlerini gerçekleştirmek için gerekli olan metotları içerir.
// JpaRepository interface'inden türetilen interface'ler, entity sınıfı ve entity sınıfının primary key veri tipini parametre olarak alır.
// Bu örnekte Student entity'si için CRUD işlemlerini gerçekleştirmek için JpaRepository interface'inden türetilen IStudentRepository interface'i oluşturulmuştur.
public interface IStudentRepository extends JpaRepository<Student, Integer>{

}
