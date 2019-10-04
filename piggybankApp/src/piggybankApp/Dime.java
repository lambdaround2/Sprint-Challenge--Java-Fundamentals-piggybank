package piggybankApp;

public class Dime extends Money {

    public Dime(int qty) {
        super(qty);
        baseValue = 0.10;
    }

    public Dime() {
        baseValue = 0.10;
    }

    @Override
    public String getName() {
        if (qty > 1) {
            return qty + " Dimes";
        } else {
            return qty + " Dime";
        }
    }
}