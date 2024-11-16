import java.util.*;

public class Task2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        double z = scanner.nextDouble();
        z = a % b == 0 ? (z * a) : (z / a);
        System.out.println(z);
    }
}
