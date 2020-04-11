package com.samples.DataStruct;

import java.util.Comparator;
import java.util.*;

public class ComparatorExample {

    public static class Employee implements Comparator<Employee> {

        private String name;
        private int age;
        private String status;

        public Employee(String name, int age, String status) {
            this.name = name;
            this.age = age;
            this.status = status;
        }

        public Employee() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int compare(Employee m1, Employee m2) {

         //   return m1.getName().compareTo(m2.getName());
           return m1.getAge() - m2.getAge();
        }

    }

    public static void main(String[] args) {

        List<Employee> Employee_List = new ArrayList<Employee>();

        Employee_List.add(new Employee("zebra", 20, "Active"));
        Employee_List.add(new Employee("tom", 18, "disabled"));
        Employee_List.add(new Employee("murray", 31, "New"));

         Employee check = new Employee();
         Collections.sort(Employee_List, check);
         for (Employee employee : Employee_List){
             System.out.println("Comprator result " + employee.getName() + " "
                     + employee.getAge() + " " + employee.getStatus());
         }
    }
}

// Comparator when object is compared with two objects specified, int his case Employee m1
// and Employee m2

    /*Comprator result tom 18 disabled
        Comprator result zebra 20 Active
        Comprator result murray 31 New
*/