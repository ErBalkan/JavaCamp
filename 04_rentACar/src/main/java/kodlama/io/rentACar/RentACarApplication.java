package kodlama.io.rentACar;

import java.util.HashMap;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.core.utilities.exceptions.ProblemDetails;
import kodlama.io.rentACar.core.utilities.exceptions.ValidationProblemDetails;

@SpringBootApplication
@RestControllerAdvice // Global Exception Handler
// Bu anotasyon ile projemizdeki tüm controller sınıflarında global bir exception handling yapısı oluşturmuş olduk.
// Bu sınıf içerisindeki metotlar, projemizdeki tüm controller sınıflarında oluşan hataları yakalayıp işleyecektir.
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}

	// http://localhost:8080/api/brands/getall


	@ExceptionHandler 
	// Bu metot, projemizde bir hata oluştuğunda çalışacak metottur.
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ProblemDetails handleBusinessException(BusinessException businessException){
		ProblemDetails problemDetails = new ProblemDetails();
		problemDetails.setMessage(businessException.getMessage());
		return problemDetails;
		// Bu metot, projemizde bir BusinessException oluştuğunda çalışacak metottur.
		// Bu metot, BusinessException'ın getMessage() metotunu çağırarak hatanın mesajını alır.
		// Bu metot, ProblemDetails sınıfından bir nesne oluşturur.
		// Bu metot, ProblemDetails sınıfının message alanına hatanın mesajını atar.
		// Bu metot, ProblemDetails sınıfının nesnesini döndürür.
	}

	@ExceptionHandler 
	// Bu metot, projemizde bir hata oluştuğunda çalışacak metottur.
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ValidationProblemDetails handleValidationException(MethodArgumentNotValidException methodArgumentNotValidException){
		ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
		validationProblemDetails.setMessage("VALIDATION.EXCEPTION");

		validationProblemDetails.setValidationErrors(new HashMap<String,String>());

		for(FieldError fieldError : methodArgumentNotValidException.getBindingResult().getFieldErrors()){
			validationProblemDetails.getValidationErrors().put(fieldError.getField(), fieldError.getDefaultMessage());
		}

		return validationProblemDetails;
	}


	// ModelMapper: İki farklı nesne arasında veri transferi yapmamızı sağlayan bir kütüphanedir.
	// ModelMapper'ı projemize eklemek için bir bean oluşturuyoruz.
	@Bean // Bu metot bir bean olacaktır.
	// Bu metotun dönüş tipi ModelMapper olacaktır.
	// Bu metotun adı getModelMapper olacaktır.
	// Bu metotun çalışma mantığı ModelMapper'ı döndürmektir.
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}
}
