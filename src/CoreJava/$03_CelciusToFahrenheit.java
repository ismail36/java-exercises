package CoreJava;

public class $03_CelciusToFahrenheit {
    public static void main(String[] args) {
        double celcius = 70.2;
        double fahrenheit = celciusToFahreinheit(celcius);
        System.out.println(fahrenheit + " fahrenheit is equal to " + celcius + " celcius.");
    }

    static double celciusToFahreinheit(double num) {
        double fahrenheit=(num*9/5)+32;
        return fahrenheit;
    }
}
