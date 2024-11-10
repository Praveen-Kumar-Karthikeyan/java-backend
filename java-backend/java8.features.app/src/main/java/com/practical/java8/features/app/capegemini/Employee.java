package com.practical.java8.features.app.capegemini;

public class Employee {

    private String empName;
    private Integer salary;
    private String dept;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Employee(String empName, Integer salary, String dept) {
        this.empName = empName;
        this.salary = salary;
        this.dept = dept;
    }

    public String getEmpName() {
        return empName;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }
}
