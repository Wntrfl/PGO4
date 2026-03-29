import java.util.ArrayList;
public class Order {
    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber;

    public Order(int orderNumber, CafeCustomer customer,  ArrayList<MenuItem> items, boolean paid, int nextOrderNumber) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.items = items;
        this.paid = paid;
        this.nextOrderNumber = nextOrderNumber;
    }

    public void addItem (MenuItem item){
        items.add(item);
    }

    public double calculateTotal(){
        double total = 0;
        for(MenuItem item : items){
            total += item.getPrice();
        }
        return total;
    }

    public int countItems(){
        return items.size();
    }

    public boolean markAsPaid(){
        return paid;
    }

    public static int getNextOrderNumber() {
            return nextOrderNumber;
    }


    @Override
    public String toString() {
        return String.format("order number : %s | customer %s | items: %s |paid:%s | next order: %s" , orderNumber, customer, items,
                paid, nextOrderNumber);
    }


}

