import java.util.*;

public class Home7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int digits = 0, sum = 0, first = -1;
        int beforeLast = n >= 10 ? n / 10 % 10 : -1;
        while (n > 0) {
            digits++;
            sum += n % 10;
            first = n % 10;
            n /= 10;
        }

        System.out.println(digits);
        System.out.println(sum);
        System.out.println(first);
        if (beforeLast != -1) {
            System.out.println(beforeLast);
        }
    }
}
