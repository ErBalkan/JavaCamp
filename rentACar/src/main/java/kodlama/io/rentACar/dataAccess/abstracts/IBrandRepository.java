package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;
import kodlama.io.rentACar.entities.concretes.Brand;

public interface IBrandRepository {
    List<Brand> getAll();
    
}
