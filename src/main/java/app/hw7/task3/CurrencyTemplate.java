package app.hw7.task3;

import java.util.*;

public class CurrencyTemplate {
    public static void main(String[] args) {
        Formatter currencyFormat = new Formatter();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter the dollar rate:");
        double currency = sc.nextDouble();

        String currencySymbol = "$";

        currencyFormat.format("%, .2f", currency);
        System.out.println(currencySymbol.concat(String.valueOf(currencyFormat)));
    }
}
