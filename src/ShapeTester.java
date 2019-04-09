import java.util.ArrayList;

public class ShapeTester {
    public static void main(String arg[]) {

        //Shape one = new Shape();

        Circle two = new Circle();
        Circle three = new Circle(4.0);

        Rectangle four = new Rectangle();
        Rectangle five = new Rectangle(4, 5);

        Square six = new Square();
        Square seven = new Square(6);

        ArrayList<Shape> shapes = new ArrayList<>();

        //shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        shapes.add(six);
        shapes.add(seven);

        for(int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i)+" with Area: "+shapes.get(i).calcArea());
        }


    }
}
