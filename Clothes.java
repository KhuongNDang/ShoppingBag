import java.util.ArrayList;

public class Clothes extends Product{

    int size;
    String color;

    public Clothes(String name, double price, int size, String color) {

        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String toString(){

        return name + ", " + color + ", size " + size + ": " + price + " euro";
    }

    public String getName(){
        return name;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
