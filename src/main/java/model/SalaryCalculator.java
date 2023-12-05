package model;

import domain.Staff;

public class SalaryCalculator extends Staff {
    public static final double CHAIRMAN_SALARY = 50000;

    public double calculateSalary(Staff employee) {
        if (employee.getPosition().equals("Chairman")) {
            return CHAIRMAN_SALARY;
        } else if (employee.getPosition().equals("Director")) {
            return CHAIRMAN_SALARY * employee.getSalaryPercentage();
        } else if (employee.getPosition().equals("employee")) {
            return CHAIRMAN_SALARY * employee.getSalaryPercentage();
        } else {
            throw new IllegalArgumentException("Invalid position: " + employee.getPosition());
        }
    }
}
