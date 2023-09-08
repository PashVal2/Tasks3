package task2.task23;
import java.util.Scanner;
public class Tester {
    public Circle[] circles = new Circle[3];
    public int cnt = 0;
    public Tester create(Tester t) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        Circle c = new Circle(scanner.nextDouble());
        System.out.print("Введите коорд. точки: ");
        c.setPoint(scanner.nextDouble(), scanner.nextDouble());
        t.circles[t.cnt] = c;

        t.cnt ++;
        return t;
    }

    public static void main(String[] args) {
        Tester t = new Tester();
        t = t.create(t);
        t = t.create(t);
        for (int i = 0; i < t.cnt; i++) {
            System.out.println(t.circles[i].toString());
        }
    }
}
