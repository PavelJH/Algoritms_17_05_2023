import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Order {
    private String orderId;
    private double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Order 1", 100.0));
        orders.add(new Order("Order 2", 50.0));
        orders.add(new Order("Order 3", 200.0));
        orders.add(new Order("Order 4", 75.0));

        Comparator<Order> orderComparator = Comparator.comparingDouble(Order::getAmount);
        Collections.sort(orders, orderComparator);

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
