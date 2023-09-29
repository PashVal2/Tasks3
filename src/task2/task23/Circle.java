package task2.task23;

public class Circle { // класс Circle
    private double r = 0.0;
    private Point p;
    public Circle(double r) { // конструктор
        this.r = r;
    }
    public void setPoint(double x, double y){
        this.p = new Point(x,y);
    } // сохдание точки для круга
    public String toString() { // возврат общей информации о круге
        return "Circle{" +
                "radius=" + this.r +
                ", x=" + this.p.getX() +
                ", y=" + this.p.getY() +
                "}";
    }
}
