package edu.monmouth.employee;

public class SalaryEmployee implements Employee {

    private int yearlySalary;

    public SalaryEmployee(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    @Override
    public int getMonthlyPay() {
        return yearlySalary / 12;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "yearlySalary=" + yearlySalary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        SalaryEmployee other = (SalaryEmployee) obj;

        return yearlySalary == other.yearlySalary;

    }


}
