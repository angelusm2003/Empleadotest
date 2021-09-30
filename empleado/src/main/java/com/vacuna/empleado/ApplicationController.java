package com.vacuna.empleado;


import com.vacuna.empleado.entity.Employee;
import com.vacuna.empleado.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class ApplicationController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployee(){
       return employeeRepository.findAll();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }


}
