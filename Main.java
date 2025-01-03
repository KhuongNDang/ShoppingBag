import java.util.ArrayList;

public class Main {



    public static void main (String[] args) {

        Basket basket = new Basket();

        Product food1 = new Food("Apple",8.25, 31,12,2024);
        Product food2 = new Food("Burger",20.50, 22,4,2025);
        Product food3 = new Food("Pizza",70.75, 17,7,2025);
        Product elec1 = new Electronic("TV", 3500.00, 6);
        Product elec2 = new Electronic("Phone", 5000.00, 6);
        Product elec3 = new Electronic("Computer", 12000.00, 6);
        Product clot1 = new Clothes("T-shirt", 120.25, 10, "black");
        Product clot2 = new Clothes("Pants", 150.75, 8, "blue");
        Product clot3 = new Clothes("Hat", 130.50, 13, "red");


        basket.addProduct(clot1);
        basket.addProduct(clot2);
        basket.addProduct(clot3);
        basket.addProduct(elec1);
        basket.addProduct(elec2);
        basket.addProduct(elec3);
        basket.addProduct(food1);
        basket.addProduct(food2);
        basket.addProduct(food3);


        System.out.println();
        System.out.println();


        basket.printAll();


    }
}
