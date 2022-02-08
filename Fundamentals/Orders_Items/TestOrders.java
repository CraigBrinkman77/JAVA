import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 2.50);
        Item item2 = new Item("latte", 3.50);
        Item item3 = new Item("coffee", 3.00);
        Item item4 = new Item("halfcaf", 2.00);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        System.out.println(order1);
        // Application Simulations
        order1.items.add(item1);
        order1.total = order1.total += item1.price;

        order3.items.add(item4);
        order3.total = order3.total += item4.price;

        order1.isReady = true;





        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.isReady);
    }
}
