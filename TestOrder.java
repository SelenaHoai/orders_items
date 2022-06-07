import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("latte", 3.5);
        Item item2 = new Item("coffee drip", 3);
        Item item3 = new Item("capuccino", 4);
        Item item4 = new Item("mocha", 3.5);
        System.out.println(item4.getName() + " " + item4.getPrice());
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        System.out.println(order1.getName());
        System.out.println(order1.getTotal());
        System.out.println(order1.getReady());
        System.out.println(order1.getItems());

// Add item1 to order2's item list and increment the order's total.
        order2.addItem(item1);
        // order2.addItem(item3);
        order2.displayOrder();
        // System.out.println(order1.getTotal());
        System.out.printf("%s your total is $%.2f\n", order2.getName(), order2.getTotal());

// order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.addItem(item3);
        order3.displayOrder();
        System.out.printf("%s your total is $%.2f\n", order3.getName(), order3.getTotal());

// order4 added a latte. Update accordingly.
        order4.addItem(item1);
        order4.displayOrder();
        System.out.printf("%s your total is $%.2f\n", order4.getName(), order4.getTotal());

// Cindhuri’s order is now ready. Update her status.
        order1.setReady();

// Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.addItem(item1);
        order4.addItem(item1);
        order4.displayOrder();
        System.out.printf("%s your total is $%.2f\n", order4.getName(), order4.getTotal());

// Jimmy’s order is now ready. Update his status.
        order2.setReady();


        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
