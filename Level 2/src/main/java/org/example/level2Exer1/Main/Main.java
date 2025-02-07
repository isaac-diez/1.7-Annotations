package org.example.level2Exer1.Main;


import org.example.level2Exer1.Model.Person;
import org.example.level2Exer1.Model.SerializerToJSON;

public class Main {
    public static void main(String[] args) {

        try {
            Person person = new Person("Isaac", 46);

            SerializerToJSON.serialize(person);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
