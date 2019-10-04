package piggybankApp;

public class Quarter extends Money {

    public Quarter(int qty) {
        super(qty);
        baseValue = 0.25;
    }

    public Quarter() {
        baseValue = 0.25;
    }

    @Override
    public String getName() {
        if (qty > 1) {
            return qty + " Quarters";
        } else {
            return qty + " Quarter";
        }
    }
}