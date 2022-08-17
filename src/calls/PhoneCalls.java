package calls;

import java.util.Scanner;

/**
 * Calls cost calculation
 * Author: Taras Chornyi
 * Date: 2022-08-17
 * Time: 7:00 PM
 */

public class PhoneCalls {
    public static float tariff1(float c1, float t1) {
        return c1 * t1;
    }

    public static float tariff2(float c2, float t2) {
        return c2 * t2;
    }

    public static float tariff3(float c3, float t3) {
        return c3 * t3;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-<*>- Phone calls from three different countries -<*>-");

        float c1 = (float) 0.5;
        float c2 = (float) 1.5;
        float c3 = (float) 2.5;

        String callRates = "\nTariffs:; \tPoland - $" + c1 + " per minute; \tGreece - $" + c2 + " per minute; \tCanada - $" + c3 + " per minute";

        String[] ratesArray = callRates.split("; ");
        for (String tariffs : ratesArray) {
            System.out.println(tariffs);
        }

        System.out.println("\nPlease enter the minutes spent on the call to Poland and then press Return:");
        float t1 = sc.nextFloat();
        System.out.println(">>> " + t1 + " min.");

        System.out.println("\nPlease enter the minutes spent on the call to Greece and then press Return:");
        float t2 = sc.nextFloat();
        System.out.println(">>> " + t2 + " min.");

        System.out.println("\nPlease enter the minutes spent on the call to Canada and then press Return:");
        float t3 = sc.nextFloat();
        System.out.println(">>> " + t3 + " min.");

        System.out.println("\nResult:");
        System.out.println("You spent on a call to Poland: $" + tariff1(c1, t1));
        System.out.println("You spent on a call to Greece: $" + tariff2(c2, t2));
        System.out.println("You spent on a call to Canada: $" + tariff3(c3, t3));

        float total = tariff1(c1, t1) + tariff2(c2, t2) + tariff3(c3, t3);
        System.out.println("\n\t Total amount of expenses: $" + total);
    }
}