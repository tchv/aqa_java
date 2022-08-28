package app.hw3.task1;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Brown", "No");
        Swallow swallow = new Swallow("Blue", "No");
        Penguin penguin = new Penguin("Red", "Yes");
        Chicken chicken = new Chicken("Green", "Yes");

        System.out.println(eagle.toString());
        eagle.fly();

        System.out.println(swallow.toString());
        swallow.fly();

        System.out.println(penguin.toString());
        penguin.fly();

        System.out.println(chicken.toString());
        chicken.fly();
    }
}
