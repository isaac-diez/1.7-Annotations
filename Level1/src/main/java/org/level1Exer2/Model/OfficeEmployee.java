package org.level1Exer2.Model;

public class OfficeEmployee extends Employee {

    static int gas;

    public OfficeEmployee(String name, String lastName, int hourlyRate, int gas) {
        super(name, lastName, hourlyRate);
        this.gas = gas;
    }

    @Deprecated
    @Override
    public void calculateWage(int hours) {

        System.out.println("Office employee's salary: " + ((super.getHourlyRate()*hours)+gas));
    }
}
