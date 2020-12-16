package se.Lexicon;

abstract class Products {


    int price;
    String name;

    abstract Products purchase(int money);

    //Getters setters...

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //...Getters setters


    String examine() {

        return "price: " + price + ", name: " + name;
    }

    String use() {

        return "Product used: " + name + ".";
    }


}

class Drinks extends Products {

    public void locoCola() {

        name = "Loco Cola";
        price = 40;
    }

    public void pepsi() {


        name = "Pepsi";
        price = 30;


    }

    String examine() {

        return "price: " + price + ", name: " + name;
    }

    String use() {

        return "Product used: " + name + ".";
    }

    @Override
    Products purchase(int money) {

        return null;
    }
}


class Food extends Products {

    public void pizza() {

        name = "Hasta la Pizza";
        price = 80;

    }

    public void hamburger() {

        name = "Hamburger";
        price = 80;

    }

    String examine() {

        return "price: " + price + ", name: " + name;
    }

    String use() {

        return "Product used: " + name + ".";
    }

    @Override
    Products purchase(int money) {
        return null;
    }
}

class Sweets extends Products {

    public void snickers() {


        name = "Snickers";
        price = 80;


    }

    public void mars() {


        name = "Mars";
        price = 80;

    }

    String examine() {

        return "price: " + price + ", name: " + name;
    }

    String use() {

        return "Product used: " + name + ".";
    }

    @Override
    Products purchase(int money) {
        return null;
    }
}






