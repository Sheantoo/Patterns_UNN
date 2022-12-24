import java.time.LocalDateTime;

public class Warehouse {
    public String name;
    public Double price;
    LocalDateTime date;

    public Warehouse(String name, Double price) {
        this.name = name;
        this.price = price;
        this.date = java.time.LocalDateTime.now();
    }

    public int Hash() {
        return name.hashCode() + price.hashCode() + date.hashCode();
    }
}
