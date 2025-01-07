package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;


@Service
// Bu annotation'ın amacı, Spring tarafından yönetilen sınıfların servis sınıfı olduğunu belirtmektir.
public class BrandManager implements IBrandService {

    private IBrandRepository brandRepository;
    @Autowired
    // Bu annotation'ın amacı, Spring tarafından yönetilen sınıfların constructor, field ve method'lara otomatik olarak bağımlılıklarını enjekte etmektir.
    // Bu annotation'ın kullanımı ile bağımlılıkların enjekte edilmesi sağlanır.
    public BrandManager (IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return this.brandRepository.getAll();
    }

}
