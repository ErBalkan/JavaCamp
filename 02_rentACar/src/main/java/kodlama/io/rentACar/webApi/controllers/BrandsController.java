package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

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

    @PostMapping("/add") // Bu metot bir post isteği olduğunda çalışır.
    public void add(@RequestBody() CreateBrandRequest request) {
        // Bu metot bir marka ekleyecektir.
        this.brandService.add(request);
    }
}
