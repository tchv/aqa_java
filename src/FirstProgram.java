import java.time.LocalDate; // 123

public class FirstProgram {
    static void infoDate(String hello) {
        String txtDate = "Today's date: ";
        LocalDate date = LocalDate.now();
        System.out.println(hello + txtDate + date);
    }
    public static void main (String...args) {
        String txtHello = "Hello, World. ";
        infoDate(txtHello);
    }
}
