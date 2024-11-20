import java.util.*;
import java.lang.Math;

public class Home3 {
    final static double PI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        if (Math.abs(PI - (double) m / n) < Math.abs(PI - (double) n / m)) {
            System.out.println(m * 10);
        } else {
            System.out.println(n * 2);
        }
    }
}
