package app.hw5.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String[] department = {"Company",
                "1. Department of Tourism",
                "2. Department of Ecology",
                "3. Department of Sports"
        };

        Scanner sc = new Scanner(System.in);
        int givenDepartmentNumber;

        System.out.println("\nThe company has three departments:\n\t" +
                "1. Department of Tourism;\n\t" +
                "2. Department of Ecology;\n\t" +
                "3. Department of Sports."
        );
        System.out.println("\nEnter department number:");
        givenDepartmentNumber = sc.nextInt();
        System.out.println(">>> " + department[givenDepartmentNumber] + "\n");

        ArrayList<Data> employeeList = new ArrayList<>();
        employeeList.add(new Data(1, "John Doe", 2500));
        employeeList.add(new Data(2, "Harry Potter", 3000));
        employeeList.add(new Data(2, "Sherlock Holmes", 3500));
        employeeList.add(new Data(3, "James Bond", 2500));
        employeeList.add(new Data(3, "Iron Man", 3000));
        employeeList.add(new Data(3, "Tony Soprano", 3500));
        for (Data currentEmployee : employeeList) {
            if (currentEmployee.department_number == givenDepartmentNumber) {
                System.out.println("Employee: " + currentEmployee.name + ", $" + currentEmployee.salary);
            }
        }
    }
}
