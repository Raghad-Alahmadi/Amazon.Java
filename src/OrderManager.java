import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();
    private HashMap<Integer, List<Order>> userOrderHistory = new HashMap<>();

    // Add a new order
    public void addOrder(Order order) {
        orders.add(order);
        userOrderHistory.computeIfAbsent(order.getUserID(), k -> new ArrayList<>()).add(order);
    }

    // Get order history for a user
    public List<Order> getUserOrderHistory(int userID) {
        return userOrderHistory.getOrDefault(userID, new ArrayList<>());
    }
}