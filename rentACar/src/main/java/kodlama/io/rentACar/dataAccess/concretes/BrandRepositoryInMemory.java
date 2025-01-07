package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;


@Repository
// Bu bir repository sınıfıdır anlamına getirir.
public class BrandRepositoryInMemory implements IBrandRepository{
    List<Brand> brands;
    public BrandRepositoryInMemory() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Fiat"));
        brands.add(new Brand(5, "Renault"));
    }
    @Override
    public List<Brand> getAll() {
        return brands;
    }

}
