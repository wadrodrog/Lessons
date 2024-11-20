import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(), n = scanner.nextInt();
        int res = 0;
        int i = 1;
        while (n > 0) {
            res += n % 10 * i;
            i *= k;
            n /= 10;
        }
        System.out.println(res);
    }
}
