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
        int i;
        System.out.println("OUTPUT SHOPPING CART");
        System.out.println(""+getCustomerName()+"'s Shopping Cart - "+getDate());
        System.out.println("Number of items: "+getNumItemsInCart()+"\n");
        if (cartItems.size() > 0){

            for (i = 0; i < cartItems.size(); i++) {
                cartItems.get(i).printItemCost();
            }

            int totalCost = 0;
            for (i = 0; i < cartItems.size(); i++) {
                totalCost += cartItems.get(i).getPrice();
            }
            System.out.println("Total: $"+totalCost);
        } else {
            System.out.println("SHOPPING CART IS EMPTY");
        }


    }

    public void printDescriptions() {
        int i;

        System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
        System.out.println(""+getCustomerName()+"'s Shopping Cart - "+getDate()+"\n");

        System.out.println("Item Descriptions");
        for (i = 0; i < cartItems.size(); i++) {
            cartItems.get(i).printItemDescription();
        }


    }
}
