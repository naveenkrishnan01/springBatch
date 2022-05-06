package io.spring.batch;

import io.spring.batch.domain.Employee;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableBatchProcessing
public class DatabaseInputApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseInputApplication.class, args);
    }

    List<Employee> emp = createEmplList();


    private static List<Employee> createEmplList() {
        Employee emp1 = new Employee(4, "eLON", "mUSK");
        Employee emp2 = new Employee(5, "John", "Roberts");

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        return empList;
    }
}