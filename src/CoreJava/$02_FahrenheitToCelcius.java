package CoreJava;

public class $02_FahrenheitToCelcius {

    public static void main(String[] args) {
        double fahrenheit = 158.36;
        double celcius = fahrenheitToCelcius(fahrenheit);
        System.out.println(celcius + " celcius is equal to " + fahrenheit + " fahrenheit");
    }

    static double fahrenheitToCelcius(double num) {
        double celcius=((num-32)*5)/9;
        return celcius;
    }
}
