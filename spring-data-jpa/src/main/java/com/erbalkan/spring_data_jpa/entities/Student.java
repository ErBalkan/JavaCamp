package com.erbalkan.spring_data_jpa.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
// Entity olduğunu belirtmek için @Entity annotation'ı kullanılır.
@Table(name = "student")
// Tablo adını belirtmek için @Table annotation'ı kullanılır.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    // ID olduğunu belirtmek için @Id annotation'ı kullanılır.
    @Column(name = "id")
    // Column annotation'ı ile veritabanındaki kolon adını belirtebiliriz.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // ID'nin nasıl oluşturulacağını belirtmek için @GeneratedValue annotation'ı kullanılır.
    // GenerationType.IDENTITY: IDENTITY tipinde bir ID oluşturulur.
    // Identity tipinde ID oluşturulduğunda, ID değeri otomatik olarak artar.
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @DateTimeFormat(iso = ISO.DATE)
    // DatetimeFormat anotasyonu ile tarih formatımızı belirttik.
    @Column(name = "birth_of_date", nullable = true)
    private Date birthOfDate;
}
