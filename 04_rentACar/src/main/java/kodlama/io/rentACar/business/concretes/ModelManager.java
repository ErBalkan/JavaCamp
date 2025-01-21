package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.IModelService;
import kodlama.io.rentACar.business.dtos.requests.CreateModelRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllModelResponse;
import kodlama.io.rentACar.core.utilities.mappers.IModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.IModelRepository;
import kodlama.io.rentACar.entities.concretes.Model;

@Service
public class ModelManager implements IModelService{
    
    private IModelRepository modelRepository;
    private IModelMapperService modelMapperService;
    
    public ModelManager(
        IModelRepository modelRepository,
        IModelMapperService modelMapperService
        ) {
        this.modelRepository = modelRepository;
        this.modelMapperService = modelMapperService;
    }


    @Override
    public List<GetAllModelResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModelResponse> response = 
            models.stream()
            .map(model -> this.modelMapperService.forResponse()
            .map(model, GetAllModelResponse.class)).collect(Collectors.toList());
        
            return response;
        }


    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = 
            this.modelMapperService
            .forRequest().map(createModelRequest, Model.class);
        this.modelRepository.save(model);
    }

}
