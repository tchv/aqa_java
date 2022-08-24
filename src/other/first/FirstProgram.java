package other.first;

import java.time.LocalDate;

public class FirstProgram {
    /** @param hello */
    static void infoDate(String hello) {
        String txtDate = new String("Today's date: ");
        LocalDate date = LocalDate.now();
        System.out.println(hello + txtDate + date);
    }
    /** @param args */
    public static void main(String...args) {
        String txtHello = new String("Hello, World. ");
        // System.out.println(args[0]);
        infoDate(txtHello);
    }
}
