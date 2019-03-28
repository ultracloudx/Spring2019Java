import java.util.Scanner;

public class ShoppingCartManager {

    static Scanner scanner = new Scanner(System.in);

    public static void printMenu(ShoppingCart cart) {
        //char choice = 'q';
        System.out.println("" +
                "\nMENU\n" +
                "a - Add item to cart\n" +
                "d - Remove item from cart\n" +
                "c - Change item quantity\n" +
                "i - Output items' descriptions\n" +
                "o - Output shopping cart\n" +
                "q - Quit\n");

        /*do {
            System.out.println("" /*+
                    "\nMENU\n" +
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
                printMenu(cart);
            }
            if (choice == 'i'){
                cart.printDescriptions();
                printMenu(cart);

            }
            if (choice == 'a'){
                ItemToPurchase itemToPurchase;
                String itemName = "";
                String itemDescription = "";
                int itemPrice = 0;
                int itemQuantity = 0;

                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                itemName = scanner.nextLine();
                System.out.println("Enter the item description:");
                itemDescription = scanner.nextLine();
                System.out.println("Enter the item price:");
                itemPrice = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the item quantity:");
                itemQuantity = Integer.parseInt(scanner.nextLine());

                itemToPurchase = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);

                cart.addItem(itemToPurchase);
                printMenu(cart);
            }
            if (choice == 'd') {

                System.out.println("REMOVE ITEM FROM CART:");
                System.out.println("Enter name of item to remove:");
                String itemToRemove = scanner.nextLine();
                cart.removeItem(itemToRemove);
            }



        } while(choice != 'q');*/
        //choice = scanner.nextLine().charAt();

        //return choice;
    }

    public static void getInput(ShoppingCart cart) {
        printMenu(cart);
        String choice="";

        do {
            System.out.println("Choose an option:");
            choice = scanner.nextLine()/*.charAt(0)*/;
            if (choice.equals("q"))break;
            if (choice != null) {
                switch (choice) {
                    case "a":
                        ItemToPurchase itemToPurchase;
                        String itemName = "";
                        String itemDescription = "";
                        int itemPrice = 0;
                        int itemQuantity = 0;

                        System.out.println("ADD ITEM TO CART");
                        System.out.println("Enter the item name:");
                        itemName = scanner.nextLine();
                        System.out.println("Enter the item description:");
                        itemDescription = scanner.nextLine();
                        System.out.println("Enter the item price:");
                        itemPrice = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter the item quantity:");
                        itemQuantity = Integer.parseInt(scanner.nextLine());

                        itemToPurchase = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);

                        cart.addItem(itemToPurchase);
                        printMenu(cart);

                        break;
                    case "d":
                        System.out.println("REMOVE ITEM FROM CART");
                        System.out.println("Enter name of item to remove:");
                        String itemToRemove = scanner.nextLine();
                        cart.removeItem(itemToRemove);
                        printMenu(cart);

                        break;
                    case "c":
                        System.out.println("CHANGE ITEM QUANTITY");
                        System.out.println("Enter the item name:");
                        String itemToModify = scanner.nextLine();
                        System.out.println("Enter the new quantity:");
                        int itemQuantityToModify = Integer.parseInt(scanner.nextLine());

                        ItemToPurchase itemToPurchase1 = new ItemToPurchase(itemToModify, "", 0,itemQuantityToModify);
                        cart.modifyItem(itemToPurchase1);

                        printMenu(cart);
                        break;
                    case "i":
                        cart.printDescriptions();
                        printMenu(cart);

                        break;
                    case "o":
                        cart.printTotal();
                        printMenu(cart);

                        break;
                    default:
                        break;
                }
            }
        } while (choice != "q");

    }

    public static void main(String arg[]) {
        String inputDate = "";
        String inputName = "January 1, 2016";
        ShoppingCart shoppingCart;

        System.out.println("Enter Customer's Name:");
        inputName = scanner.nextLine();
        System.out.println("Enter Today's Date:");
        inputDate = scanner.nextLine();

        System.out.println("\nCustomer Name: "+inputName);
        System.out.println("Today's Date: "+inputDate);
        shoppingCart = new ShoppingCart(inputName, inputDate);

        //printMenu(shoppingCart);
        getInput(shoppingCart);


    }
}
