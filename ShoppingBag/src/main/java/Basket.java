import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Object> bag;



    public Basket() {
        this.bag = new ArrayList<>();
    }

    public boolean addProduct(Product product) {
        bag.add(product);
        System.out.println(product.getName() + " was added to the basket.");
        return true;
    }

    public void printAll(){
        double totalPrice = 0;

        System.out.println("Clothes");
        for (Object obj : bag) {
            if (obj instanceof Clothes) {
                System.out.println(obj);
                totalPrice = totalPrice + ((Clothes) obj).getPrice();
            }
        }
        System.out.println();
        System.out.println("Electronics");
        for (Object obj : bag) {
            if (obj instanceof Electronic) {
                System.out.println(obj);
                totalPrice = totalPrice + ((Electronic) obj).getPrice();

            }
        }
        System.out.println();
        System.out.println("Food");
        for (Object obj : bag) {
            if (obj instanceof Food){
                System.out.println(obj);
                totalPrice = totalPrice + ((Food) obj).getPrice();

            }
        }
        System.out.println();
        System.out.println("Total: " + totalPrice);

    }

}