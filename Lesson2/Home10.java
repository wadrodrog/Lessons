import java.util.*;

public class Home10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String msg;

        if ((n < 10 || n > 20) && n % 10 == 1) {
            msg = "год";
        } else if ((n < 10 || n > 20) && n % 10 > 1 && n % 10 < 5) {
            msg = "года";
        } else {
            msg = "лет";
        }
        System.out.println(n + " " + msg);
    }
}
