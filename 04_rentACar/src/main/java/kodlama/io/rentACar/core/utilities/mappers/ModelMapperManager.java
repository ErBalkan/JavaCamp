package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperManager implements IModelMapperService{

    private ModelMapper modelMapper;
    public ModelMapperManager(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration() // // ModelMapper'ın konfigürasyonunu ayarla.
        .setAmbiguityIgnored(true) // Aynı isimde birden fazla özellik varsa hata verme.
        .setMatchingStrategy(MatchingStrategies.LOOSE);
        // Nesnede ID,name,x,y,z var ama ben sadece ID,name maple dediğim zaman hata vermeyecek.(LOOSE)
        
        return this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration() // ModelMapper'ın konfigürasyonunu ayarla.
        .setAmbiguityIgnored(true) // Aynı isimde birden fazla özellik varsa hata verme.
        .setMatchingStrategy(MatchingStrategies.STANDARD);
        // (STANDARD) Her özelliğin maplenmesi gerek...

        return this.modelMapper;
    }

}
