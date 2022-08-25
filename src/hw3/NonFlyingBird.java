package hw3;

public class NonFlyingBird extends Bird {
    protected String protectMethod() {
        return super.protectMethod();
    }

    public static void main(String[] args) {
        NonFlyingBird nfb = new NonFlyingBird();
        Bird[] b = {nfb};
        for (Bird element: b) {
            System.out.println(element.publicMethod());
        }
    }
}
