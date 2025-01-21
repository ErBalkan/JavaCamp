package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.dtos.requests.CreateModelRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllModelResponse;

public interface IModelService {
    List<GetAllModelResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
