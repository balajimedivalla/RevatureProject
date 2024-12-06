package simple;
import java.util.ArrayList;
import java.util.List;

class Coffee {
    String type;
    String size;
    int quantity;

    public Coffee(String type, String size, int quantity) {
        this.type = type;
        this.size = size;
        this.quantity = quantity;
    }
}

class Order {
    String customerName;
    List<Coffee> coffeeList;

    public Order(String customerName, List<Coffee> coffeeList) {
        this.customerName = customerName;
        this.coffeeList = coffeeList;
    }
}

class CoffeeShop {
    private static final double[][] PRICES = {
        {2.00, 2.50, 3.00}, // Regular
        {3.00, 3.50, 4.00}, // Latte
        {3.50, 4.00, 4.50}, // Cappuccino
        {2.50, 3.00, 3.50}  // Espresso
    };

    public static double calculateTotalCost(Order order) {
        double totalCost = 0;

        for (Coffee coffee : order.coffeeList) {
            int typeIndex = getTypeIndex(coffee.type);
            int sizeIndex = getSizeIndex(coffee.size);

            if (typeIndex != -1 && sizeIndex != -1) {
                totalCost += PRICES[typeIndex][sizeIndex] * coffee.quantity;
            }
        }

        return totalCost;
    }

    private static int getTypeIndex(String type) {
        switch (type) {
            case "Regular":
                return 0;
            case "Latte":
                return 1;
            case "Cappuccino":
                return 2;
            case "Espresso":
                return 3;
            default:
                return -1;
        }
    }

    private static int getSizeIndex(String size) {
        switch (size) {
            case "Small":
                return 0;
            case "Medium":
                return 1;
            case "Large":
                return 2;
            default:
                return -1; // Invalid size
        }
    }
}

public class CoffeeShopManagement {
    public static void main(String[] args) {
        List<Coffee> coffee = new ArrayList<>();
        coffee.add(new Coffee("Regular", "Small", 27));
        coffee.add(new Coffee("Latte", "Medium", 5));
        coffee.add(new Coffee("Cappuccino", "Large", 3));

        List<Coffee> coffee1 = new ArrayList<>();
        coffee1.add(new Coffee("Espresso", "Small", 2));
        coffee1.add(new Coffee("Latte", "Large", 1));

        Order order = new Order("Customer 1", coffee);
        Order order1 = new Order("Customer 2", coffee1);

        System.out.println("Total Cost for Order 1: " + CoffeeShop.calculateTotalCost(order));
        System.out.println("Total Cost for Order 2: " + CoffeeShop.calculateTotalCost(order1));
    }
}

