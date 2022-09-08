package app.other;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-<*>- Determination of the maximum and minimum value of three numbers -<*>-");

        System.out.println("\nPlease enter the first integer and then press Return:");
        int num1 = sc.nextInt();
        System.out.println(">>> " + num1);

        System.out.println("\nPlease enter the second integer and then press Return:");
        int num2 = sc.nextInt();
        System.out.println(">>> " + num2);

        System.out.println("\nPlease enter the third integer and then press Return:");
        int num3 = sc.nextInt();
        System.out.println(">>> " + num3);

        System.out.println("\n[  *  RESULT  *  ]");
        System.out.println("\nMin");
        System.out.println(">>> " + Math.min(Math.min(num1, num2), num3));
        System.out.println("\nMax");
        System.out.println(">>> " + Math.max(Math.max(num1, num2), num3));
    }
}
