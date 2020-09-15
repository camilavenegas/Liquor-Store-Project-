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
    private Taxes(){
        this.taxPercentage = 12;
    }
    public static Taxes getInstance(){
        if(instance == null){
            instance= new Taxes();
        }
        return instance;
    }
    public float getSingeltonData(){
        return taxPercentage;
    }
    
    public float salesTotal(float valuePrice, float percentage){
        float totalCost = valuePrice + percentage;
        return totalCost;
    }
    
    /* USTax usTax = USTax.getInstance();
        float price = 10;
        float parcialPrice = ((price*usTax.getSingeltonData())/100);

        System.out.println("Wilson Toapanta --> 6382");
        
        System.out.println("tax percentage -->" + usTax.getSingeltonData());
        System.out.println("price (tax) --> " + parcialPrice);
        System.out.println("total price --> " + (usTax.salesTotal(price, parcialPrice)));

    */
}
