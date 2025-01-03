public class Electronic extends Product {

    int warranty;



    public Electronic(String name, double price, int warranty){

        super(name, price);
        this.warranty = warranty;
    }


    public String toString(){

        return name + ", " + warranty + " months warranty: " + price + " euro";
    }

    @Override
    public double getPrice(){
        return price;
    }
}
