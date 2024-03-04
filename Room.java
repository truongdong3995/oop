package Bai1;

public class Room {
    private String type;
    private double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }

    // Getter methods
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
