package app.hw8.task1;

import java.util.Scanner;

public class App {
    private static String getFromConsole(String msg) {
        Scanner sc = new Scanner(System.in);

        System.out.println(msg);
        String value = sc.nextLine();
        System.out.println(">>> " + value);

        return value;
    }
    private static String getSquare() {
        String valueA = getFromConsole("Enter the value of side A:");
        int a = Integer.parseInt(valueA);

        String valueB = getFromConsole("Enter the value of side B:");
        int b = Integer.parseInt(valueB);

        try {
            int sq = Rectangle.squareRectangle(a, b);
            return String.valueOf(sq);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        return "Can not calculate";
    }

    public static void main(String[] args) {
        System.out.println("\n[ AREA CALCULATOR ]\n");
        System.out.println("Result: Area = " + getSquare());
    }
}
