package com.amsidh.mvc;

import com.amsidh.mvc.model.Employee;
import com.amsidh.mvc.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        if(employeeRepository.findAll().isEmpty()){
            List<Employee> employees = Arrays.asList(
                    new Employee("Amsidh", "Lokhande", "amsidhlokhande@gmail.com", true),
                    new Employee("Anjali", "Lokhande", "anjalilokhande@gmail.com", true),
                    new Employee("Adithi", "Lokhande", "adithilokhande@gmail.com", true),
                    new Employee("Aditya", "Lokhande", "adityalokhande@gmail.com", true),
                    new Employee("Babasha", "Lokhande", "babashalokhande@gmail.com", true)
            );
           employeeRepository.saveAll(employees);
        }
    }
}
