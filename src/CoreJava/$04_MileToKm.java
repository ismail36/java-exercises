package CoreJava;

public class $04_MileToKm {
    public static void main(String[] args) {
        double km = 15;
        double mile =  mile(km);
        System.out.println(mile + " mile is equal to " + km + " km.");
    }

    static double mile(double km) {
        double mile=km*0.6213712;
        return mile;
    }
}
