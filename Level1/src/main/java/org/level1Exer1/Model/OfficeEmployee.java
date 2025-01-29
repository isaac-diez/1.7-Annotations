package org.level1Exer1.Model;

public class OfficeEmployee extends Employee {

    static int gas;

    public OfficeEmployee(String name, String lastName, int hourlyRate, int gas) {
        super(name, lastName, hourlyRate);
        this.gas = gas;
    }

    @Override
    public void calculateWage(int hours) {

        System.out.println("Office employee's salary: " + ((super.getHourlyRate()*hours)+gas));
    }
}
