package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface IBrandRepository extends JpaRepository<Brand, Integer> {
    // Brand veri tipi ve onun ID özelliğinin veri tipi.
    // List<Brand> getAll();
    // Bu JpaRepository sınıfı sayesinde bu metotlara gerek kalmadı.
    // JpaRepository sınıfı, veritabanı işlemlerini otomatik olarak yapar (CRUD). 

    boolean existByName(String name); 
    // Bu metot, veritabanında bir marka adının olup olmadığını kontrol eder.
}
