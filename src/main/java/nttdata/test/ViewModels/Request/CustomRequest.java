package nttdata.test.ViewModels.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomRequest {
    @NotBlank(message = "The document couldn´t be empty")
    @Size(min = 3, max = 20, message = "The document length must be min 3 and max 20 characters")
    String documentNumber;

    @NotBlank(message = "The document type must contain less a letter, and must to be C or P")
    @Size(min = 1, max = 1, message = "The document type must contain just a letter, and must to be C or P")
    @Pattern(regexp = "^(C|P)$", message = "The document type must to be C or P")
    String documentType;
}
