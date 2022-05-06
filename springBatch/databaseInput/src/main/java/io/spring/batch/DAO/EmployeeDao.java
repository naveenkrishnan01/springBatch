package io.spring.batch.DAO;

import io.spring.batch.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    public int[]batchInsert(final List<Employee> employeeList);
}
