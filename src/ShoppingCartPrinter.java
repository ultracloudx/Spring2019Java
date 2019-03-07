import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int price;
        int quantity;
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        name = scanner.nextLine();

        System.out.println("Enter the item price:");
        price = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the item quantity:");
        quantity = Integer.parseInt(scanner.nextLine());

        item1.setName(name);
        item1.setPrice(price);
        item1.setQuantity(quantity);

        //scanner.nextLine(); //clean up buffer
        System.out.println("\nItem 2");
        System.out.println("Enter the item name:");
        name = scanner.nextLine();

        System.out.println("Enter the item price:");
        price = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the item quantity:");
        quantity = Integer.parseInt(scanner.nextLine());

        item2.setName(name);
        item2.setPrice(price);
        item2.setQuantity(quantity);

        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName()+" "+item1.getQuantity()+" @ $"+item1.getPrice()+" = $"
                +(item1.getPrice()*item1.getQuantity()));
        System.out.println(item2.getName()+" "+item2.getQuantity()+" @ $"+item2.getPrice()+" = $"
                +(item2.getPrice()*item2.getQuantity()));

        System.out.println("\nTotal: $"
                +((item1.getPrice()*item1.getQuantity())+(item2.getPrice()*item2.getQuantity())));


    }
}
