import java.util.ArrayList;
import java.lang.String;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        this.cartItems = new ArrayList<ItemToPurchase>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) {
        System.out.println("ADD ITEM TO CART");
        System.out.println("Enter the item name:");


        cartItems.add(0, item);
    }

    public void removeItem(String item) {
        int i;

        for (i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).equals(item)) {
                cartItems.remove(i);
                break;
            } else {
                System.out.println("Item not found in car. Nothing removed");
            }
        }
    }

    public void modifyItem(ItemToPurchase item) {
        int i;

        for (i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).equals(item)) {

            } else {
                System.out.println("Item not found in cart. Nothing modified.");
            }
        }

    }

    public int getNumItemsInCart() {
        int total = 0;
        total = cartItems.size();

        return total;
    }

    public int getCostOfCart() {
        int totalCost = 0;


        return totalCost;
    }

    public void printTotal() {
        System.out.println("OUTPUT SHOPPING CART");
        System.out.println(""+getCustomerName()+"'s Shopping Cart - "+getDate());
        if (cartItems.size() > 0){
            System.out.println("Number of items: "+getNumItemsInCart()+"\n");


            System.out.println("Total: "); //ADD IN TOTAL
        } else {
            System.out.println("SHOPPING CART IS EMPTY");
        }


    }

    public void printDescriptions() {
        System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
        System.out.println(""+getCustomerName()+"'s Shopping Cart - "+getDate());


    }
}
