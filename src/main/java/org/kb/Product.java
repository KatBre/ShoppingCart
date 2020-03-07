package org.kb;

public class Product {
    private String productName;
    private double netto;
    private double tax;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getNetto() {
        return netto;
    }

    public void setNetto(double netto) {
        this.netto = netto;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getBrutto() {
        double brutto = netto + netto * tax / 100;
       return brutto;
    }

}
