package task2.task26;

public class Circle {
    private double r = 0.0;
    private double x = 0.0;
    private double y = 0.0;
    public Circle (double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
    public double getRad() {
        return this.r;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setRad(double r) {
        this.r = r;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double sq() {
        return 3.14 * Math.pow(this.r, 2);
    }
    public double line() {
        return 2.0 * 3.14 * (this.r);
    }
    public String compair(Circle c, Circle c1) {
        if (c.r > c1.r) return "Первая окружность больше";
        else return "Вторая окружность больше";
    }
}
