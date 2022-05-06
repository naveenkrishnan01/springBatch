package io.spring.batch.configuration;

import io.spring.batch.domain.Employee;
import io.spring.batch.domain.EmployeeRowMapper;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class EmployeeJobConfiuration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    @Bean
    public JdbcCursorItemReader<Employee> readItemReader() {
        JdbcCursorItemReader<Employee> reader = new JdbcCursorItemReader<>();
        reader.setSql("select id, firstName, lastName from employee order by lastName, firstName");
        reader.setDataSource(this.dataSource);
        reader.setRowMapper(new EmployeeRowMapper());
        return reader;
    }

    @Bean
    public ItemWriter<Employee> employeeItemWriter() {
        return employeeItems -> {
            for (Employee items : employeeItems){
                System.out.println(items.toString());
            }
        };
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1").
                <Employee , Employee>chunk(2).
                reader(readItemReader()).
                writer(employeeItemWriter()).build();

    }

    @Bean
    public Job job() {
        return jobBuilderFactory.get("job").start(step1()).build();
    }

}
