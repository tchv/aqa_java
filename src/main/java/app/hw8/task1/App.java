package app.hw8.task1;

import java.util.Scanner;

public class App {
    private static int squareRectangleValues() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of side A:");
        String valueA = sc.nextLine();
        System.out.println(">>> " + valueA);

        System.out.println("Enter the value of side B:");
        String valueB = sc.nextLine();
        System.out.println(">>> " + valueB);

        int a = Integer.parseInt(valueA);
        int b = Integer.parseInt(valueB);

        return Exception.squareRectangle(a, b);
    }

    public static void main(String[] args) {
        System.out.println("\n[ AREA CALCULATOR ]\n");
        System.out.println("Result: Area = ".concat(String.valueOf(squareRectangleValues())));
    }
}
