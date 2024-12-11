package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String employeeId, name, department;
    private double payRate, hoursWorked, startTime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = 0;
    }

    public void punchIn(double startTime) {
        this.startTime = startTime;
    }

    public void punchIn() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh.mm");
        //10-23-2024TZ1:30:00 -> 01.30
        this.startTime = Double.parseDouble(LocalDateTime.now().format(format));
    }

    public void punchOut(double endTime) {
        this.hoursWorked += endTime-this.startTime;
        this.startTime = 0;
    }

    public void punchOut() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh.mm");
        this.hoursWorked += Double.parseDouble(LocalDateTime.now().format(format))-this.startTime;
    }

    public void punchTimeCard(double time) {
        //startTime = 0 before punch in
        //after punch in startTime = 6.00

        //punch out time = 10.00
        //hoursWorked increases by 10-6=4

        if(this.startTime == 0) { //punch in
            this.startTime = time;
        } else { //punch out
            this.hoursWorked += time-this.startTime;
            this.startTime = 0;
        }
    }

    public void punchTimeCard() {
        double time = Double.parseDouble(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh.mm")));
        if(this.startTime == 0) { //punch in
            this.startTime = time;
        } else { //punch out
            this.hoursWorked += time-this.startTime;
            this.startTime = 0;
        }
    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();
        double overtimePay = (this.payRate * 1.5) * this.getOvertimeHours();
        return regularPay + overtimePay;
    }

    public double getRegularHours() {
        //return Math.min(this.hoursWorked, 40)
        if(this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        //return Math.max(this.hoursWorked-40, 0)
        return (this.hoursWorked > 40) ? this.hoursWorked-40 : 0;
    }
}
