import java.util.ArrayList;
import java.lang.String;

public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
        this.cartItems = new ArrayList<ItemToPurchase>();
    }

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

        cartItems.add(cartItems.size(), item);
    }

    public void removeItem(String item) {
        int i;
        boolean found = false;

        for (i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(item)) {
                cartItems.remove(i);
                found = true;
                break;
            }

        }
        if (found == false) {
            System.out.println("Item not found in cart. Nothing removed.");
        }

    }

    public void modifyItem(ItemToPurchase item) {
        int i;
        boolean found = false;

        for (i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(item.getName())) {
                int tempVal = item.getQuantity();
                cartItems.get(i).setQuantity(tempVal);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Item not found in cart. Nothing modified.");
        }

    }

    public int getNumItemsInCart() {
        int i;
        int totalItems = 0;
        for (i = 0; i < cartItems.size(); i++){
            totalItems += (cartItems.get(i).getQuantity());
        }


        return totalItems;
    }

    public int getCostOfCart() {
        int i;
        int totalCost = 0;
        for (i = 0; i < cartItems.size(); i++) {
            totalCost += (cartItems.get(i).getPrice()*cartItems.get(i).getQuantity());
        }


        return totalCost;
    }

    public void printTotal() {
        int i;
        System.out.println("OUTPUT SHOPPING CART");
        System.out.println(""+getCustomerName()+"\'s Shopping Cart - "+getDate());
        System.out.println("Number of Items: "+getNumItemsInCart()+"\n");
        if (cartItems.size() > 0){

            for (i = 0; i < cartItems.size(); i++) {
                cartItems.get(i).printItemCost();

            }System.out.println();

            System.out.println("Total: $"+getCostOfCart());
        } else {
            System.out.println("SHOPPING CART IS EMPTY");

            System.out.println("\nTotal: $"+getCostOfCart());
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
