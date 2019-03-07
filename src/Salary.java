
import java.util.Scanner;

public class Salary {
    public static void main(String [] args){
        double wage = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in wage rate: ");
        wage = scanner.nextDouble();

        System.out.print("Salary is ");
        System.out.print(wage * 40 * 50);
    }
}
