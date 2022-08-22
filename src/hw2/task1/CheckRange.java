package hw2.range;

import java.util.Scanner;

public class CheckRange {
    public static float getX(float min, float max, float num) {
        if (num >= min && num <= max) {
            System.out.println("\nYes:");
        } else {
            System.out.println("\nNo:");
        }
        return num;
    }

    public static void main(String[] args) {
        float min = -5f;
        float max = 5f;

        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println(getX(min, max, num1));
        System.out.println(getX(min, max, num2));
        System.out.println(getX(min, max, num3));

        System.out.println("\nMin:");
        System.out.println(Math.min(Math.min(num1, num2), num3));
        System.out.println("\nMax:");
        System.out.println(Math.max(Math.max(num1, num2), num3));
    }
}

