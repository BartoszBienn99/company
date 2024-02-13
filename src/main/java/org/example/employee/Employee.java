package org.example.employee;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employee {

    int id;
    String name;
    String lastName;
    LocalDate dateOfBirth;
    String position;




    public Employee(int id, String name, String lastName, LocalDate dateOfBirth, String position) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: '" + name + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", dateOfBirth: " + dateOfBirth +
                ", position: '" + position + '\'';
    }
}
