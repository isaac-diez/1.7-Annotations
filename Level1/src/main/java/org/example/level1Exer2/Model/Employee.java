package org.example.level1Exer2.Model;

public abstract class Employee {

    private String name;
    private String lastName;
    private int hourlyRate;

    public Employee(String name, String lastName, int priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.hourlyRate = priceHour;
    }



    public int getHourlyRate() {
        return hourlyRate;
    }

    public void calculateWage(int hours) {

        System.out.println(hours * this.hourlyRate);

    }
}
