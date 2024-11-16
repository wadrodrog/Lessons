import java.util.*;

public class Task2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int ans = 1;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 7 == 0) {
                ans *= a[i];
            }
        }
        System.out.println(ans);
    }
}
