package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.business.dtos.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.dtos.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dtos.responses.GetByIdBrandResponse;

@RestController 
// Bu bir controller sınıfıdır anlamına getirir. 
// Bu sınıfın bir controller olduğunu belirtir.
@RequestMapping("/api/brands") 
// Bu controller sınıfı hangi isteklerde çalışacak belirtir. 
public class BrandsController {
    private IBrandService brandService;
    // Bu controller sınıfı hangi servis ile çalışacak belirtir.
    public BrandsController(IBrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall") 
    // Bu metot bir get isteği olduğunda çalışır.
    // Bu metot tüm markaları listeleyecektir.
    // Bu metotun dönüş tipi List<Brand> olacaktır.
    // Bu metotun adı getAll olacaktır.
    // Bu metotun çalışma mantığı brandService'den gelecektir.
    // Bu metotun çalışma mantığı brandService'nin getAll metotu olacaktır.
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @GetMapping("/{id}") // Bu metot bir get isteği olduğunda çalışır.
    // Bu metot bir marka id'sine göre markayı getirecektir.
    public GetByIdBrandResponse getById(@PathVariable int id){
        return brandService.getById(id);
    }

    @PostMapping("/add") // Bu metot bir post isteği olduğunda çalışır.
    @ResponseStatus(code = HttpStatus.CREATED) // Bu metotun dönüş kodu 201 olacaktır.
    public void add(@RequestBody() CreateBrandRequest request) {
        // Bu metot bir marka ekleyecektir.
        this.brandService.add(request);
    }

    @PutMapping("/update") // Bu metot bir güncelleme/put isteği olduğunda çalışır.

    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
        this.brandService.update(updateBrandRequest);
        /*
         @RequestBody, HTTP isteğiyle gönderilen gövde (body) içeriğini almak için kullanılır. 
         Bu genellikle POST, PUT gibi HTTP yöntemlerinde kullanılır ve veri genellikle JSON formatında gelir.
         */
    }

    @DeleteMapping("/{id}") // Bu metot bir silme/delete isteği olduğunda çalışır.
    // Bu metot bir marka id'sine göre markayı silecektir.
    public void delete(@PathVariable int id){
        this.brandService.delete(id);
        /*
        @PathVariable, URL yolundaki (path) parametreleri almak için kullanılır. Yani, URL içinde belirli bir bölümdeki değeri elde etmek için bu anotasyon kullanılır. 
        Genellikle RESTful API'lerinde dinamik URL parçalarına parametre olarak veri iletmek için kullanılır.
         */
    }
}
