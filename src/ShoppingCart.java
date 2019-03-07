import java.util.ArrayList;

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

    }

    public void removeItem(String item) {

    }

    public void modifyItem(ItemToPurchase item) {

    }

    public int getNumItemsInCart() {
        int total = 0;


        return total;
    }

    public int getCostOfCart() {
        int totalCost = 0;


        return totalCost;
    }

    public void printTotal() {


    }

    public void printDescriptions() {

    }
}
