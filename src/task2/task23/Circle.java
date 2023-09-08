package task2.task23;

public class Circle {
    private double r = 0.0;
    private Point p;
    public Circle(double r) {
        this.r = r;
    };
    public void setPoint(double x, double y){
        this.p = new Point(x,y);
    }
    public String toString() {
        return "Circle{" +
                "radius=" + this.r +
                ", x=" + this.p.getX() +
                ", y=" + this.p.getY() +
                "}";
    }
}
