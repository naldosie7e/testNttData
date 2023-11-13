package nttdata.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import nttdata.test.Controllers.FactorialController;
import nttdata.test.Services.FactorialService;
import nttdata.test.ViewModels.Response.FactorialResponse;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(FactorialController.class)
public class FactorialControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private FactorialService factorialService;

    @Test
    public void getFactorialTest() throws Exception {
        FactorialResponse factorial = new FactorialResponse("Se realizo correctamente el calculo", 120);

        when(factorialService.getFactorialFromNumber(5)).thenReturn(factorial);
        mvc.perform(MockMvcRequestBuilders
                .get("/api/getFactorial/5")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.factorial").value(factorial.getFactorial()))
                .andDo(print());
    }
}
