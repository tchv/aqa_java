package app.hw7.task2;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "I    am      learning     Java   Core";
        System.out.println(str.replaceAll("\\s+"," ").trim());
    }
}
