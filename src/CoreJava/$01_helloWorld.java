package CoreJava;

public class $01_helloWorld {

    static String name = "Jhon";

    public static void main(String[] args) {
        message(name);
    }

    static void message(String name) {
        System.out.println("Hello " + name + ".");
    }

}
