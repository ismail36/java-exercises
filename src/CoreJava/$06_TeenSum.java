package CoreJava;

public class $06_TeenSum {
    public static void main(String[] args) {
        System.out.println(teenSum(3,4));
        System.out.println(teenSum(2,13));
        System.out.println(teenSum(12,20));
    }

    public static int teenSum(int a, int b) {
        int sum = a+b;
        return a>=13 && a<=19 ? 19 : b>=13 && b<=19 ? 19 : sum;
    }
}
