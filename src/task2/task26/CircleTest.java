package task2.task26;

import java.util.Scanner;

public class CircleTest { // тестирование класса окружности
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle c = new Circle(2.0, 3.0, 1.0);
        Circle c1 = new Circle(1.0, 3.0, 1.0);
        System.out.println(c.getRad());
        System.out.println(c.getX());
        System.out.println(c.getY());
        c1.setRad(s.nextDouble());
        System.out.println(c1.compair(c,c1));
        System.out.println(c1.sq());
        System.out.print(c.line());
    }
}
