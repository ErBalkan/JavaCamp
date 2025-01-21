package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.dataAccess.abstracts.IBrandRepository;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;

@Service
public class BrandBusinessRules {
    
    private IBrandRepository brandRepository;
    public BrandBusinessRules(IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public void checkIfBrandNameExists(String name){
        if(this.brandRepository.existByName(name)){
            throw new BusinessException("Brand name already exists");
        }
    }
}
