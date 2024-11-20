import java.util.*;
import java.lang.Math;

public class Home8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int cur = 1;
        for (int i = 0; i < n; i++) {
            int p = cur > 0 ? -1 : 1;
            a[i] = -(p * Math.abs(cur));
            cur = -a[i] + 2 * p;
        }
        for (int k : a) {
            System.out.println(k);
        }
    }
}
