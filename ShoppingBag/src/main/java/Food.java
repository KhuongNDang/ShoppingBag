import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food extends Product {

    private LocalDate expireDate;


    public Food(String name, double price, int day, int month, int year) {
        super(name, price);
        this.expireDate = LocalDate.of(year, month, day);

    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return name + ", " + expireDate.format(formatter) + ": " + price + " euro";
    }

    @Override
    public double getPrice(){
        return price;
    }
}

