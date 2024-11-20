import java.util.*;
import java.lang.Math;

public class Home9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.println(f1(a));
        System.out.println(f2(a));
    }

    public static double f1(double x) {
        if (x <= 0) {
            return 0;
        }
        if (x <= 1) {
            return x;
        }
        return x * x * x * x;
    }

    public static double f2(double x) {
        if (x <= 0) {
            return 0;
        }
        if (x <= 1) {
            return x * x - x;
        }
        return x * x - Math.sin(Math.PI * x * x);
    }
}
