package io.spring.batch.IMPL;

import io.spring.batch.DAO.EmployeeDao;
import io.spring.batch.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int[] batchInsert(List<Employee> employee) {
        final String INSERT_EMPLOYEE =
                "insert into employee(firstName, lastName) values (?,?)";
        return this.jdbcTemplate.batchUpdate(INSERT_EMPLOYEE,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, employee.get(i).getFirstName());
                        ps.setString(2, employee.get(i).getLastName());
                    }

                    @Override
                    public int getBatchSize() {
                        return employee.size();
                    }
                });
    }

    }

