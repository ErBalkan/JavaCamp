package kodlama.io.rentACar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}

	// http://localhost:8080/api/brands/getall

	@Bean // Bu metot bir bean olacaktır.
	// Bu metotun dönüş tipi ModelMapper olacaktır.
	// Bu metotun adı getModelMapper olacaktır.
	// Bu metotun çalışma mantığı ModelMapper'ı döndürmektir.
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
