package hw3;

public class Bird extends Object{
    public Bird() {
        super();
    }

    private String privateStaticMethod() {
        return "From static Bird";
    }

    public static String publicStaticMethod() {
        return "From public static Bird";
    }

    private String privateMethod() {
        return "From private Bird";
    }

    String defaultMethod() {
        return "From default Bird";
    }

    protected String protectMethod() {
        return "From protected Bird";
    }

    public String publicMethod() {
        return "From public Bird";
    }
}
