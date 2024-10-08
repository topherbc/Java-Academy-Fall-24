package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked, payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + this.employeeId +
                ", Name='" + this.name + '\'' +
                ", Gross Pay=" + this.getGrossPay() +
                '}';
    }

    public double getGrossPay() {
        return this.hoursWorked * this.payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
