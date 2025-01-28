package com.erhanBalkan.spring_core.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.erhanBalkan.spring_core.entity.User;
import com.erhanBalkan.spring_core.services.UserService;

@Configuration 
// Bu bir konfigürasyon sınıfıdır. 
// Bu sınıfın bir bean olarak tanımlanması için @Configuration anotasyonu kullanılır.

public class AppConfig {

    @Bean
    // Bu metot bir bean tanımlar.
    public UserService userService(){
        UserService userService = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("Erhan"));
        userList.add(new User("Enes"));

        userService.setUserList(userList);
        return userService;
    }
    // Spring context kasasına bir bean ekledik
    // bu beani istediğimiz yerden çağırabiliriz.
    // Bu bean'ın adı userService'dir.
    // Bu bean'ın tipi UserService'dir.
    // Bu bean'ın scope'u singleton'dır.
    // Bu bean'ın oluşturulması için userService() metodu çağrılır.
    // Bu bean'ın oluşturulması için userService() metodu çağrıldığında userService nesnesi oluşturulur.
    // userService nesnesi userList adında bir liste oluşturur.
    // userList listesine iki adet User nesnesi ekler.
    // userService nesnesi userList listesini set eder.
    // userService nesnesi döndürülür.

}
