import java.util.ArrayList;
import java.lang.String;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = "January 1, 2016";
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
        //System.out.println("SHOPPING CART IS EMPTY);


    }

    public void printDescriptions() {

    }
}
