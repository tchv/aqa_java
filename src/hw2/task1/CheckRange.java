package hw2.task1;

import java.util.Scanner;

public class CheckRange {
    public static float getX(float min, float max, float num) {
        if (num >= min && num <= max) {
            System.out.println("\nYes");
        } else {
            System.out.println("\nNo");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float min = -5f;
        float max = 5f;

        System.out.println("-<*>- Checking whether numbers are in the range from [" + min + "] to [" + max + "] -<*>-");


        System.out.println("\nPlease enter the first float and then press Return:");
        float num1 = sc.nextFloat();
        System.out.println(">>> " + num1);

        System.out.println("\nPlease enter the second float and then press Return:");
        float num2 = sc.nextFloat();
        System.out.println(">>> " + num2);

        System.out.println("\nPlease enter the third float and then press Return:");
        float num3 = sc.nextFloat();
        System.out.println(">>> " + num3);

        System.out.println("\n[  *  RESULT  *  ]");
        System.out.println(">>> " + getX(min, max, num1));
        System.out.println(">>> " + getX(min, max, num2));
        System.out.println(">>> " + getX(min, max, num3));
    }
}

