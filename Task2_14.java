import java.util.*;

public class Task2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(), n = scanner.nextInt();
        double[] a = new double[n];
        double m = 0;
        int c = 0;
        for (int j = 0; j < n; j++) {
            a[j] = scanner.nextDouble();
            if (j + 1 != i) {
                m += a[j];
                c++;
            }
        }
        System.out.println(m / c);
    }
}
