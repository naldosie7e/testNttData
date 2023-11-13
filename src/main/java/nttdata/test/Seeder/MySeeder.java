package nttdata.test.Seeder;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import nttdata.test.Models.Employee;
import nttdata.test.Models.Sell;
import nttdata.test.Services.EmployeeService;
import nttdata.test.Services.SellService;

@Component
public class MySeeder {

    @Autowired
    private SellService sellService;

    @Autowired
    private EmployeeService employeeService;

    public void run() {
        Employee employee = saveEmploye();

        Sell sell = new Sell();
        sell.setEmployee(employee);
        sell.setSellDescription("Test");
        sell.setSellValue(Float.parseFloat("12000"));
        sellService.save(sell);
        sell = new Sell();
        sell.setEmployee(employee);
        sell.setSellDescription("Test 2");
        sell.setSellValue(Float.parseFloat("22000"));
        sellService.save(sell);

    }

    public Employee saveEmploye() {
        Employee employee = new Employee();
        employee.setName("Reynaldo Vargas Gaitan");
        return employeeService.save(employee);
    }

}