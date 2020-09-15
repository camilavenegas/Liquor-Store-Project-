/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class Taxes {

    private static Taxes instance;
    private float taxPercentage;

    public Taxes() {
        this.taxPercentage = 12;
    }

    public static Taxes getInstance() {
        if (instance == null) {
            instance = new Taxes();
        }
        return instance;
    }

    public float getSingeltonData() {
        return taxPercentage;
    }

    public float salesTotal(float valuePrice, float percentage) {
        float totalCost = valuePrice + percentage;
        return totalCost;
    }

    public float calculateTaxes(float price) {
        Taxes usTax = Taxes.getInstance();
        //float price = 10;
        float parcialPrice = ((price * usTax.getSingeltonData()) / 100);
        return usTax.salesTotal(price, parcialPrice);
    }

}
