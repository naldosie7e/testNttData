package nttdata.test.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.test.Models.Employee;
import nttdata.test.Repositories.EmployeeRepository;
import nttdata.test.Services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository service;

    @Override
    public Employee save(Employee employee) {
        return service.saveAndFlush(employee);
    }

}
