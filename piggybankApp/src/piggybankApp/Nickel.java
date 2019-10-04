package piggybankApp;

public class Nickel extends Money {

    public Nickel(int qty) {
        super(qty);
        baseValue = 0.05;
    }

    public Nickel() {
        baseValue = 0.05;
    }

    @Override
    public String getName() {
        if (qty > 1) {
            return qty + " Nickels";
        } else {
            return qty + " Nickel";
        }
    }
}