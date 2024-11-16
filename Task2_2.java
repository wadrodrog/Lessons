import java.util.*;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        String msg;
        if (0 <= hours && hours < 6) {
            msg = "Доброй ночи";
        } else if (6 <= hours && hours < 10) {
            msg = "Доброе утро";
        } else if (10 <= hours && hours < 17) {
            msg = "Добрый день";
        } else if (17 <= hours && hours <= 23) {
            msg = "Добрый вечер";
        } else {
            msg = "Ошибка";
        }
        System.out.println(msg);
    }
}
