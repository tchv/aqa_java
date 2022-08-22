package hw1.task2;

import java.util.Scanner;

/**
 * Calls cost calculation
 * Author: Taras Chornyi
 * Date: 2022-08-17
 * Time: 7:00 PM
 */

public class PhoneCalls {
    public static double tariff(double a, double b) {
        return a * b;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-<*>- Phone calls from three different countries -<*>-");

        double c1 = 0.5;
        double c2 = 1.5;
        double c3 = 2.5;

        String callRates = "\nTariffs:; \tPoland - $" + c1 + " per minute; \tGreece - $" + c2 + " per minute; \tCanada - $" + c3 + " per minute";

        String[] ratesArray = callRates.split("; ");
        for (String tariffs : ratesArray) {
            System.out.println(tariffs);
        }

        System.out.println("\nPlease enter the minutes spent on the call to Poland and then press Return:");
        double t1 = sc.nextDouble();
        System.out.println(">>> " + t1 + " min.");

        System.out.println("\nPlease enter the minutes spent on the call to Greece and then press Return:");
        double t2 = sc.nextDouble();
        System.out.println(">>> " + t2 + " min.");

        System.out.println("\nPlease enter the minutes spent on the call to Canada and then press Return:");
        double t3 = sc.nextDouble();
        System.out.println(">>> " + t3 + " min.");

        System.out.println("\nResult:");
        System.out.println("You spent on a call to Poland: $" + tariff(c1, t1));
        System.out.println("You spent on a call to Greece: $" + tariff(c2, t2));
        System.out.println("You spent on a call to Canada: $" + tariff(c3, t3));

        double total = tariff(c1, t1) + tariff(c2, t2) + tariff(c3, t3);
        System.out.println("\n\t Total amount of expenses: $" + total);
    }
}