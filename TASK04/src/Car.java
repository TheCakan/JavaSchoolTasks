public class Car {

    public String getMake() {
        return make;
    }

    private String make;

    public int getPrice() {
        return price;
    }

    public void toString(int price, String make) {
        this.price = price;
        this.make = make;
    }

    private int price;


}

