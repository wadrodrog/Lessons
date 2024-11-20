import java.util.*;
import java.lang.Math;

public class Home6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(solve1(a, n));
        System.out.println(solve2(a, n));
    }

    public static double solve1(double a, int n) {
        double result = 0;
        int k = 1;
        for (int i = 0; i < n; i++) {
            result += 1.0 / Math.pow(a, k);
            k *= 2;
        }
        return result;
    }

    public static double solve2(double a, int n) {
        double result = 1;
        for (int i = 0; i <= n; i++) {
            result *= a - i * n;
        }
        return result;
    }
}
