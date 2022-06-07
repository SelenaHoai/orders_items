import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item>items = new ArrayList<Item>();

// CONSTRUCTOR
    public Order() {
        this.name = name;
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;   
    }

// METHOD
    // add
    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

    // display
    public void displayOrder() {
        for (Item item: items) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }

// GETTER & SETTER
    // getter
    public String getName() {
        return this.name;
    }

    // getter
    public double getTotal(){
        double total=0.0;
        for(Item i: this.items){
        total += i.getPrice();}
        return total;
    }

    // getter
    public boolean getReady() {
        return this.ready;
    }

    //setter
    public void setReady() {
        this.ready = true;
        System.out.printf("%s, your order is ready.\n", this.name);
    }

    // getter
    public ArrayList<Item>getItems() {
        return this.items;
    }

}


