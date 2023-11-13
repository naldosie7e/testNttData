package nttdata.test.Services.impl;

import org.springframework.stereotype.Service;

import nttdata.test.Services.FactorialService;
import nttdata.test.ViewModels.Response.FactorialResponse;

@Service
public class FactorialServiceImpl implements FactorialService {

    @Override
    public FactorialResponse getFactorialFromNumber(Integer number) {
        Integer factorialNumber = null;
        for (int i = number; i >= 1; i--) {
            if (i == number) {
                i = i - 1;
                factorialNumber = number * i;
            } else {
                factorialNumber = factorialNumber * i;
            }
        }
        return new FactorialResponse("Se realizo correctamente el calculo", factorialNumber);
    }
}
