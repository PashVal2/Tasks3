package task2.task26;

public class Circle { // класс окружность
    private double r = 0.0;
    private double x = 0.0;
    private double y = 0.0;
    public Circle (double r, double x, double y) { // конструктор
        this.r = r;
        this.x = x;
        this.y = y;
    }
    public double getRad() {
        return this.r;
    } // возврат радиуса
    public double getX() {
        return this.x;
    } // возврат х
    public double getY() {
        return this.y;
    } // возврат у
    public void setRad(double r) {
        this.r = r;
    } // установка радиуса
    public void setX(double x) {
        this.x = x;
    } // установка х
    public void setY(double y) {
        this.y = y;
    } // установка у
    public double sq() {
        return 3.14 * Math.pow(this.r, 2);
    } // расчет площади
    public double line() {
        return 2.0 * 3.14 * (this.r);
    } // расчет длины окр
    public String compair(Circle c, Circle c1) { // возврат общей информации об окружности
        if (c.r > c1.r) return "Первая окружность больше";
        else return "Вторая окружность больше";
    }
}
