import java.util.*;

public class Home2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (i > 1 && a[i - 1] > a[i - 2] && a[i - 1] > a[i] && a[i - 1] % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt == 2 ? "YES" : "NO");
    }
}
