package nttdata.test.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nttdata.test.Services.FactorialService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class FactorialController {

    @Autowired
    FactorialService factorialService;

    @GetMapping("/getFactorial/{factorialNumber}")
    public ResponseEntity<?> getFactorial(@PathVariable Integer factorialNumber) {

        return ResponseEntity.ok(factorialService.getFactorialFromNumber(factorialNumber));
    }

}
