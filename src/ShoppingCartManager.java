import java.util.Scanner;

public class ShoppingCartManager {

    static Scanner scanner = new Scanner(System.in);

    public static char printMenu(ShoppingCart cart) {
        char choice = 'q';

        do {
            System.out.println("" +
                    "MENU\n" +
                    "a - Add item to cart\n" +
                    "d - Remove item from cart\n" +
                    "c - Change item quantity\n" +
                    "i - Output items' descriptions\n" +
                    "o - Output shopping cart\n" +
                    "q - Quit\n\n" +
                    "Choose an option:");
            choice = scanner.nextLine().charAt(0);
            if (choice == 'o'){
                cart.printTotal();
            }
            if (choice == 'i'){
                cart.printDescriptions();
            }
            if (choice == 'a'){
                cart.addItem();
            }


        } while(choice != 'q');
        //choice = scanner.nextLine().charAt();

        return choice;
    }

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart;
        String inputDate = "";
        String inputName = "January 1, 2016";

        System.out.println("Enter Customer's Name:");
        inputName = scanner.nextLine();
        System.out.println("Enter Today's Date:");
        inputDate = scanner.nextLine();


        System.out.println("\nCustomer Name: "+inputName);
        System.out.println("Today's Date: "+inputDate);

        shoppingCart = new ShoppingCart(inputName, inputDate);

        printMenu(shoppingCart);


    }
}
