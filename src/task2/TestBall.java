package task2;

import java.util.Scanner;
public class TestBall {
    public static void main (String[] args) {
        Ball first_ball = new Ball(0.0, 0.0);
        System.out.println("X: " + first_ball.getX());
        System.out.println("Y: " + first_ball.getY());
        Scanner input = new Scanner(System.in);

        first_ball.setX(1.0);
        first_ball.setY(2.0);
        System.out.println(first_ball.toString());
        first_ball.setXY(4.0, 3.0);

        first_ball.move(-1.0, 1.0);

        System.out.println("Общая информация: ");
        System.out.println(first_ball.toString());
    }
}
