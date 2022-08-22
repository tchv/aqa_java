package hw1.task1;

import java.util.Scanner;

/**
 * Simple console calculator
 * Author: Taras Chornyi
 * Date: 2022-08-16
 * Time: 6:00 PM
 */

public class SimpleCalculator {
    public static int plus(int num1, int num2) {
        return num1 + num2;
    }

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-<*>- Hello. You are using Simple Console Calculator -<*>-");

        System.out.println("\nPlease enter the first integer and then press Return:");
        int num1 = sc.nextInt();
        System.out.println(">>> " + num1);

        System.out.println("\nPlease enter the second integer and then press Return:");
        int num2 = sc.nextInt();
        System.out.println(">>> " + num2);

        System.out.println("\nResult:");
        System.out.println(num1 + " + " + num2 + " = " + plus(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + minus(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
    }
}
