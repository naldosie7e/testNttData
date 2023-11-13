package nttdata.test.Controllers;

import jakarta.validation.Valid;
import nttdata.test.Services.CustomService;
import nttdata.test.Services.WelcomeService;
import nttdata.test.ViewModels.Request.CustomRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @GetMapping("/hola")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody CustomRequest request) {

        return ResponseEntity.ok(welcomeService.welcomeMessage());
    }

}