package org.example.employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Employee employeeToAdd = new Employee(1, "Marek", "Kowal", LocalDate.of(1984, 2, 9), "worker", 28.5);
        Employee employeeToAdd2 = new Employee(2, "Kuba", "Michalski", LocalDate.of(1978, 6, 10), "office-worker", 4500);
        Employee employeeToAdd3 = new Employee(3, "Janusz", "Zawiślak", LocalDate.of(1994, 5, 6), "worker", 30.5);
        Employee employeeToAdd4 = new Employee(4, "Dawid", "Nowak", LocalDate.of(1989, 2, 5), "office-worker", 5000);

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(employeeToAdd);
        allEmployees.add(employeeToAdd2);
        allEmployees.add(employeeToAdd3);
        allEmployees.add(employeeToAdd4);

        boolean isWorking = true;
        while (isWorking) {
            System.out.println("Wybierz akcję:");
            System.out.println("1. Wyświetl listę pracowników");
            System.out.println("2. Wylicz wynagrodzenie");
            System.out.println("3. Zakończ program");

            int action;
            Scanner scanner = new Scanner(System.in);
            action = scanner.nextInt();

            switch (action) {
                case 1:
                    for (Employee employee : allEmployees) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    System.out.println("Podaj ID pracownika dla którego chcesz wyliczyć wynagrodzenie: ");
                    int employeeId = scanner.nextInt();
                    try {
                        Employee selectedEmployee = allEmployees.stream().filter(a -> a.getId()==employeeId).toList().get(0);
                        int age = Period.between(selectedEmployee.getDateOfBirth(), LocalDate.now()).getYears();
                        System.out.println("Id: " + selectedEmployee.getId() +
                                ", Name: '" + selectedEmployee.getName() + '\'' +
                                ", LastName: '" + selectedEmployee.getLastName() + '\'' +
                                ", Age: " + age +
                                ", Position: '" + selectedEmployee.getPosition());
                        System.out.println("Podaj ilośc przepracowanych dni");
                        int workedDays = scanner.nextInt();
                        if (workedDays>20 || workedDays<1){
                            System.out.println("Wprowadzono niepoprawną ilość dni");
                            break;
                        }
                        System.out.println("Ustal wysokość premii");
                        int bonus = scanner.nextInt();
                        double salary;
                        if (selectedEmployee.getPosition().equals("worker")){
                            if (workedDays==20) {
                                salary = workedDays * 8 * selectedEmployee.getSalary() + bonus;
                            }else {
                                salary = workedDays * 8 * selectedEmployee.getSalary();
                            }
                        } else {
                            if (workedDays==20){
                                salary = selectedEmployee.getSalary()+bonus;
                            }else {
                                salary = selectedEmployee.getSalary()*0.8+bonus;
                            }
                        }
                        System.out.println("Wypłata brutto: " + salary);
                        if (age>26){
                            System.out.println("Wysokość podatku: 18%");
                            double net = salary - salary*0.18;
                            System.out.println("Wypłata netto: " + net);
                        } else {
                            System.out.println("Wysokość podatku: 0%");
                            System.out.println("Wypłata netto: " + salary);
                        }
                    } catch (Exception e){
                        System.out.println("Nie znaleziono pracownika");
                    }
                    break;
                case 3:
                    isWorking = false;
                    break;
                default:
                    System.out.println("Źle wykonana operacja");
            }
        }
    }
}

