import java.util.*;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String msg;
        switch (k) {
            case 1:
                msg = "Плохо";
                break;
            case 2:
                msg = "Неудовлетворительно";
                break;
            case 3:
                msg = "Удовлетворительно";
                break;
            case 4:
                msg = "Хорошо";
                break;
            case 5:
                msg = "Отлично";
                break;
            default:
                msg = "Ошибка";
        }
        System.out.println(msg);
    }
}
