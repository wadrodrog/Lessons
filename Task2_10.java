import java.util.*;

public class Task2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > 0) {
                sum += a[i] * 2;
            }
        }
        System.out.println(sum);
    }
}
