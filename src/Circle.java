public class Circle implements Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.14159 * radius * radius;
    }

    @Override
    public String toString() {
        return "I am Circle";
    }
}
