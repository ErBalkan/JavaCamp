package kodlama.io.rentACar.business.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
    // VALIDATION
    @NotNull // Bu değerin null olmaması gerektiğini belirtir.
    @NotBlank // Bu değerin boş olmaması gerektiğini belirtir.
    @Size(min = 3, max = 20) // Bu değerin minimum 3, maksimum 20 karakter olması gerektiğini belirtir.
    private String name;
    
    @NotNull
    @NotBlank
    private int brandId;
}
