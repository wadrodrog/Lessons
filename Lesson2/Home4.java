import java.util.*;

public class Home4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += check(scanner.nextInt()) ? 1 : 0;
        }
        System.out.println(cnt == 2 ? "YES" : "NO");
    }

    public static boolean check(int n) {
        int flag = -1;
        int cnt = 0;
        while (n > 0) {
            if (flag == -1) {
                flag = n % 2;
            }
            if (flag != n % 2) {
                return false;
            }
            cnt++;
            n /= 10;
        }
        return cnt == 3 || cnt == 5;
    }
}
