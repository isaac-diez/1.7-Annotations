package org.level1Exer1.Model;

public class OnlineEmployee extends Employee {

    final int INTERNET = 50;

    public OnlineEmployee(String name, String lastName, int hourlyRate) {
        super(name, lastName, hourlyRate);
    }

    @Override
    public void calculateWage(int hours) {

        System.out.println("Online employee's salary: " + ((super.getHourlyRate()*hours)+INTERNET));
    }
}
