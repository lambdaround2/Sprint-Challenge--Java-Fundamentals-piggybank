package piggybankApp;

public class Penny extends Money {

    public Penny(int qty) {
        super(qty);
        baseValue = 0.25;
    }

    public Penny() {
        baseValue = 0.25;
    }

    @Override
    public String getName() {
        if (qty > 1) {
            return qty + " Pennies";
        } else {
            return qty + " Penny";
        }
    }
}