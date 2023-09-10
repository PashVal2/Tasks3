package task2.task24;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Shop shop = new Shop();
        while (true) {
            System.out.println(
                    """
                    1) Добавить компьютер
                    2) Удалить компьютер
                    3) Поиск компьютера
                    4) Выход""");
            int choice = scanner.nextInt();

            if (choice == 1)
                shop.addComp(scanner2.nextLine());
            else if (choice == 2)
                shop.deleteComp(scanner2.nextLine());
            else if (choice == 3)
                System.out.println(shop.findComp(scanner2.nextLine()));
            else break;
        }
    }
}

