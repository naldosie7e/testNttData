package nttdata.test.Seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainSeeder implements CommandLineRunner {

    @Autowired
    MySeeder mySeeder;

    @Override
    public void run(String... args) throws Exception {
        // execute the code you want to or just call an other function that will handle
        // that like the following
        mySeeder.run();
    }
}
