package org.level1Exer1.Main;

import org.level1Exer1.Model.OfficeEmployee;
import org.level1Exer1.Model.OnlineEmployee;

public class Main {
    public static void main(String[] args) {

        OnlineEmployee onlineEmployee = new OnlineEmployee("Isaac","Diez", 60);
        OfficeEmployee officeEmployee = new OfficeEmployee("Jose","Garcia", 40,50);

        onlineEmployee.calculateWage(200);

        officeEmployee.calculateWage(160);

    }
}