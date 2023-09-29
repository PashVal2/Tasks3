package task2.task23;

public class Point { // класс Point
    private double x = 0.0;
    private double y = 0.0;
    public Point(double x, double y) { // конструктор
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    } // возврат x
    public double getY() {
        return this.y;
    } // возврат y
}
