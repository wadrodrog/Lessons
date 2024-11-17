import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (i > 1 && array[i - 1] > array[i - 2] && array[i - 1] > array[i] && array[i - 1] % 2 == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
