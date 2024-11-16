import java.util.*;

public class Task2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("а) " + f1(a));
        System.out.println("б) " + f2(a));
    }

    public static double f1(double x) {
        if (-2 <= x && x < 2) {
            return x * x;
        }
        return 4;
    }

    public static double f2(double x) {
        double t = x * x + 4 * x + 5;
        if (x <= 2) {
            return t;
        }
        return 1 / t;
    }
}
