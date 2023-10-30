package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return payRate * hoursWorked;
        } else {
            double regularHoursPay = payRate * 40;
            double overtimeHoursPay = (hoursWorked - 40) * (payRate * 1.5);
            return regularHoursPay + overtimeHoursPay;
        }
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked <= 40) {
            return 0;
        } else {
            return hoursWorked - 40;
        }
    }
}
