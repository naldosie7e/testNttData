package nttdata.test.Services;

import nttdata.test.ViewModels.Response.FactorialResponse;

public interface FactorialService {
    FactorialResponse getFactorialFromNumber(Integer number);
}
