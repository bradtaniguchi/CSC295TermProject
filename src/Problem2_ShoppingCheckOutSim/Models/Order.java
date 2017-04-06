package Problem2_ShoppingCheckOutSim.Models;

import java.util.List;

/**
 *
 * @author brad
 * and order is a user and a list of item
 */
public class Order {
    private User user;
    private List<Item> items;
    private int orderNumber; 
    public Order(User user, List<Item> items, int orderNumber) {
        this.user = user;
        this.items = items;
        this.orderNumber = orderNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
