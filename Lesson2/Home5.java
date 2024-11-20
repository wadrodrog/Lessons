import java.util.*;

public class Home5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
            if (a[i] < 0) {
                a[i] += 0.5;
            } else {
                a[i] = 0.1;
            }
        }
        for (double k : a) {
            System.out.println(k);
        }
    }
}
