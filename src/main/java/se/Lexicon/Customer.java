package se.Lexicon;

import java.util.Arrays;

public class Customer implements VendingMachine {

    int moneyPool = 0;
    Products[] products;
    int[] denominations;

    @Override
    public void addCurrency(int amount) {
        moneyPool += amount;

    }

    @Override
    public Products request(int productNumber) {


        return null;
    }



    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
