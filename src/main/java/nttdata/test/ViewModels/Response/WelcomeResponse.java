package nttdata.test.ViewModels.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WelcomeResponse {
    String message;
    String teamName;
}
