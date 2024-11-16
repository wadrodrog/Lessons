import java.util.*;
import java.lang.Math;

public class Task2_3 {
    private static int menu(Scanner scanner) {
        System.out.println("1) Возвести число в квадрат");
        System.out.println("2) Извлечь корень квадратный");
        System.out.println("3) Вычислить синус");
        System.out.println("4) Вычислить косинус");
        int action = 0;
        while (action < 1 || action > 4) {
            System.out.print("Выберите действие: ");
            action = scanner.nextInt();
        }
        return action;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = 0;
        switch (menu(scanner)) {
            case 1:
                result = x * x;
                break;
            case 2:
                result = Math.sqrt(x);
                break;
            case 3:
                result = Math.sin(x);
                break;
            case 4:
                result = Math.cos(x);
        }
        System.out.println(result);
    }
}
