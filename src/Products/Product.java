package Products;

public class Product {
    private String Name;
    private double Price;
    private State state;
    private double weight;


    public Product(String name, double price, State state, double weight) {
        Name = name;
        Price = price;
        this.state = state;
        this.weight=weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
