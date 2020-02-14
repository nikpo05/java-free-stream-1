package lesson3_Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product newProduct = new Product("Milk");
        newProduct.regularPrice = 0.8;
        newProduct.discount = 20;
        newProduct.actualPrice();
        newProduct.printInformation();
    }
}
