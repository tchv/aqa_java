package app.hw8.task1;

public class Exception {
    public static int squareRectangle(int a, int b){
        if (a < 0 || b < 0){
            throw new RuntimeException("You entered a negative value!");
        }
        return a * b;
    }
}
