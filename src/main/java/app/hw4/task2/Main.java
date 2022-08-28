package app.hw4.task2;

public class Main {
    public static void main(String[] args) {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        System.out.println("[ Json Parser ]\n" + root.toString());
    }
}
