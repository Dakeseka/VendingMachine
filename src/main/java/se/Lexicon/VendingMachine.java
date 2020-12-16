package se.Lexicon;

public interface VendingMachine {

    void addCurrency (int amount);
    Products request (int productNumber);
    int endSession();
    String getDescription (int productNUmber);
    int getBalance();
    String[] getProducts();

}





