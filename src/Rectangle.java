public class Rectangle implements Shape{

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
        height = 1.0;
        width = 2.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return "I am Rectangle";
    }
}
