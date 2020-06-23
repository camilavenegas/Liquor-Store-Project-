/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Collection;

/**
 *
 * @author hp
 */
public class Combo {
   
    private double priceCombo1;
    private double priceCombo2;
    private double priceCombo3;
    private double priceCombo4;
    private String name;
    Snack snack= new Snack();
    Collection combo1;
    Collection combo2;
    
    public double calculateCombo1Price(){
         priceCombo1=4.0+4.5+3;
        
        return priceCombo1;
    }

    public void show(){
        combo1.add(new Beverage("Clasic", 1.5, "Switch", 4.0, 1));
        combo1.add(new Beverage("Clasic", 3.75, "1/2 Norteño", 4.5, 5));
        combo1.add(new Snack(1, 1, 1));
        double totalPriceCombo1= calculateCombo1Price();
        System.out.println("The price is-->"+totalPriceCombo1);
        
        combo2.add(new Beverage("Vodka", 1, "Smirnof", 15.0, 11));
        
        combo
        
    }
    
    
}
