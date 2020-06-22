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
   
    private float priceCombo;
    private String name;
    Snack snack= new Snack();
    Collection combo1;
    Collection combo2;

    public void show(){
        combo1.add(new Beverage("Clasic", 1.5, "Switch", 4.0, 1));
        combo1.add(new Beverage("Clasic", 3.75, "1/2 Norteño", 4.5, 5));
        combo1.add(new Snack(1, 1, 1));
        
    }
    
}
