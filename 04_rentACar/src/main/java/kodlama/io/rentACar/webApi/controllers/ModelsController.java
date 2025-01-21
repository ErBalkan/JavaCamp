package kodlama.io.rentACar.webApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import kodlama.io.rentACar.business.abstracts.IModelService;
import kodlama.io.rentACar.business.dtos.requests.CreateModelRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllModelResponse;

@RestController
@RequestMapping("/api/models")
public class ModelsController {

    private IModelService modelService;
    public ModelsController(IModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping()
    public List<GetAllModelResponse> getAll(){
        return modelService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }
}
