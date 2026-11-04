package edu.monmouth.employee;

public class SalesEmployee implements Employee {

    private int commission;
    private int yearlyBase;

    public SalesEmployee(int yearlyBase) {
        this.yearlyBase = yearlyBase;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public int getMonthlyPay() {
        return (yearlyBase / 12);
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "commission=" + commission +
                ", yearlyBase=" + yearlyBase +
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

        SalesEmployee other = (SalesEmployee) obj;

        return commission == other.commission && yearlyBase == other.yearlyBase;
    }


}
