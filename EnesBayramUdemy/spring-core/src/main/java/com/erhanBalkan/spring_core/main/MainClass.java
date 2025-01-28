package com.erhanBalkan.spring_core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.erhanBalkan.spring_core.config.AppConfig;
import com.erhanBalkan.spring_core.entity.User;
import com.erhanBalkan.spring_core.services.LoginService;
import com.erhanBalkan.spring_core.services.UserService;

public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // AppConfig.class dosyasını okuyarak context oluşturduk.
        // Bu context içerisinde tanımlı olan bean'ları kullanabiliriz.
        // Bu context içerisinde tanımlı olan bean'ları kullanabilmek için AppConfig.class dosyasında tanımlı olması gerekmektedir.
        
        UserService userService = context.getBean(UserService.class);
        // context içerisinde tanımlı olan UserService tipindeki bean'ı aldık.
        for (User user : userService.getUserList()) {
            System.out.println(user.getFirstName());
        }
        // userService nesnesi içerisindeki userList listesindeki User nesnelerini yazdırdık.
        
        LoginService loginService = new LoginService();
        loginService.login();
    
    } 
}
