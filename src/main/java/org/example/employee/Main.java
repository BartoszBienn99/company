package org.example.employee;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int action;
        Scanner scanner = new Scanner(System.in);
        action = scanner.nextInt();



        Employee employeeToAdd = new Employee(1, "Marek", "Kowal", LocalDate.of(1984,2,9),"worker");
        Employee employeeToAdd2 = new Employee(2, "Kuba", "Michalski", LocalDate.of(1978,6,10),"office-worker");
        Employee employeeToAdd3 = new Employee(3, "Janusz", "Zawiślak", LocalDate.of(1994,5,6),"worker");
        Employee employeeToAdd4 = new Employee(4,"Dawid","Nowak",LocalDate.of(1989,2,5),"office-worker");






        List<Employee> allEmployees = new ArrayList<Employee>();
        allEmployees.add(employeeToAdd);
        allEmployees.add(employeeToAdd2);
        allEmployees.add(employeeToAdd3);
        allEmployees.add(employeeToAdd4);

        switch (action){
            case 1:
                for (int i=0;i<allEmployees.size();i++){
                    System.out.println(allEmployees.get(i));
                }
            case 2:

            case 3:
                break;
        }

    }



}