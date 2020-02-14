package lesson3_Product;

public class Product {
    public String name;
    double regularPrice;
    double discount;
public Product (String name) {
this.name = name;
}
    double actualPrice(){
        return regularPrice - regularPrice * discount/100;
    }
    void printInformation() {
        System.out.println("Product : name = " + "\"" +  this.name + "\"" + ", regular price = " + this.regularPrice + " EUR, discount = " + this.discount + "%, actual price = " + this.actualPrice() + " EUR");
    }
}
