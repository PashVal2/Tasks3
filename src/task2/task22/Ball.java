package task2.task22;

public class Ball { // класс Ball
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double x, double y) { // конструктор
        this.x = x;
        this.y = x;
    }

    public double getX() {
        return this.x;
    } // возврат x
    public double getY() {
        return this.y;
    } // возврат y
    public void setX(double x) {
        this.x = x;
    } // изменение x
    public void setY(double y) {
        this.y = y;
    } // изменение y
    public void setXY(double x, double y) { // изменение xy
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp) { // изменение xy на определенную длину
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString() { // возврат общей информации о шарах
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                 "}";
    }
}
