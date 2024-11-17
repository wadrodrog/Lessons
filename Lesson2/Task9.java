import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 5 == 0 && array[i] % 7 != 0) {
                count++;
                sum += array[i];
            }
        }
        System.out.println(count + " " + sum);
    }
}
