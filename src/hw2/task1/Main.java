package hw2.task1;

import hw2.task2.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nHello! What is your name?");
        String userName = sc.nextLine();
        System.out.println(">>> " + userName);

        System.out.println("\nEnter your year of birth");
        String userBirthYear = sc.nextLine();
        int userYear = Integer.parseInt(userBirthYear);
        System.out.println(">>> " + userBirthYear);

        System.out.println("\nEnter your month of birth");
        String userBirthMonth = sc.nextLine();
        int userMonth = Integer.parseInt(userBirthMonth);
        System.out.println(">>> " + userBirthMonth);

        System.out.println("\nEnter your date of birth");
        String userBirthDay = sc.nextLine();
        int userDay = Integer.parseInt(userBirthDay);
        System.out.println(">>> " + userBirthDay);

        Person p = new Person();
        p.setName(userName);
        p.setBirthDate(LocalDate.of(userYear, userMonth, userDay));

        System.out.println("\n[  *  RESULT  *  ]");
        System.out.println(p);
    }
}
