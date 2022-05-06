package io.spring.batch.configuration;

import io.spring.batch.domain.Employee;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class EmployeeConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public ItemReader<Employee> employeeItemReader() {
        XStreamMarshaller unmarshall = new XStreamMarshaller();

        Map<String, Class> aliase = new HashMap<>();
        aliase.put("employee", Employee.class);

        unmarshall.setAliases(aliase);

        StaxEventItemReader<Employee> reader = new StaxEventItemReader<>();
        reader.setResource(new ClassPathResource("/data/employees.xml"));
        reader.setFragmentRootElementName("employee");
        reader.setUnmarshaller(unmarshall);
        return reader;
    }

    public ItemWriter<Employee> employeeItemWriter() {
        return items -> {
            for (Employee item : items){
                System.out.println(item.toString());
            }
        };
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Employee, Employee>chunk(10)
                .reader(employeeItemReader())
                .writer(employeeItemWriter())
                .build();
    }

    @Bean
    public Job job() {
        return jobBuilderFactory.get("job")
                .start(step1())
                .build();
    }
}
