package org.example.employee;

import java.time.LocalDate;


public class Employee {

    int id;
    String name;
    String lastName;
    LocalDate dateOfBirth;
    String position;

    double salary;


    public Employee(int id, String name, String lastName, LocalDate dateOfBirth, String position, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
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
