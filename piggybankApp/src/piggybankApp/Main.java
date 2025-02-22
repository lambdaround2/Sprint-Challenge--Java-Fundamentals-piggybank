package piggybankApp;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        Quarter dep1 = new Quarter();
        Dime dep2 = new Dime();
        Dollar dep3 = new Dollar(5);
        Nickel dep4 = new Nickel(3);
        Dime dep5 = new Dime(7);
        Dollar dep6 = new Dollar();
        Penny dep7 = new Penny(10);

        ArrayList<Money> piggybank = new ArrayList<Money>();
        piggybank.add(dep1);
        piggybank.add(dep2);
        piggybank.add(dep3);
        piggybank.add(dep4);
        piggybank.add(dep5);
        piggybank.add(dep6);
        piggybank.add(dep7);

        piggybank.forEach(el -> System.out.println(el.getName()));

        double sum = 0.0;
        for (Money p : piggybank) {
            double value = p.getTotalValue();
            sum = sum + value;
        }

        System.out.println("The piggy bank holds " + fp.format(sum));
    }

}