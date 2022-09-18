package app.hw8.task1;

public class Exception {
    public static int squareRectangle(int a, int b){
        if (a < 0 || b < 0){
            throw new RuntimeException("error");
        }
        return a * b;
    }
}
