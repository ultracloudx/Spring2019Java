import java.lang.String;
import java.util.Scanner;

public class RectangleChecker {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int pointX, pointY, height, width;

        System.out.println("Enter x coordinate: ");
        pointX = scanner.nextInt();
        System.out.println("Enter y coordinate: ");
        pointY = scanner.nextInt();

        System.out.println("Enter width: ");
        width = scanner.nextInt();
        System.out.println("Enter height: ");
        height = scanner.nextInt();

        BetterRectangle myRect = new BetterRectangle(pointX, pointX, height, width);

        System.out.println("The perimeter of the rectangle is: " + myRect.getPerimeter());
        System.out.println("The area of the rectangle is: " + myRect.getArea());


    }
}
