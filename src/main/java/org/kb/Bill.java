package org.kb;

import java.util.List;

public class Bill {
    private List<Product> purchasedProducts;

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }


    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void invoice() {
        System.out.println(purchasedProducts);
    }

    public double nettoBill() {
        double sum = purchasedProducts.stream()
                .mapToDouble(Product::getNetto)
                .sum();
        return sum;
    }

    public double bruttoBill() {
        double sum = purchasedProducts.stream()
                .mapToDouble(Product::getBrutto)
                .sum();
       return  sum;
    }

    public double giveTax() {
        double tax = bruttoBill() - nettoBill();
        return tax;
    }

}
