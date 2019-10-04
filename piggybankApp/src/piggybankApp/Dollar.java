package piggybankApp;

public class Dollar extends Money {
    public Dollar(int qty) {
        super(qty);
        baseValue = 1.00;
    }

    public Dollar() {
        baseValue = 1.00;
    }

    @Override
    public String getName() {
        return "$" + qty;
    }
}