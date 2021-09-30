package com.vacuna.empleado.configuration;

import com.vacuna.empleado.entity.Employee;
import com.vacuna.empleado.entity.User;
import com.vacuna.empleado.repository.EmployeeRepository;
import com.vacuna.empleado.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class InitTestData implements ApplicationListener<ApplicationContextEvent> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {

        employeeRepository.save(new Employee(1, 1234567890, "Pedro",
            "test",
            "correo@correo.com"));
        log.info("Empleado guardado");

        userRepository.save(
                new User("angelr@correo.com", "password", "USER")
        );
        log.info("Usuario guardado");
    }
}
