package nttdata.test.Services.impl;

import org.springframework.stereotype.Service;

import nttdata.test.Services.WelcomeService;
import nttdata.test.ViewModels.Response.WelcomeResponse;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public WelcomeResponse welcomeMessage() {
        return new WelcomeResponse("Hola", "Developers from Colombia");
    }

}
