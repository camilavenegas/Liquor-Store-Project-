/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Camila Venegas
 */
public class Combo {

    private ArrayList<Beverage> beverages = new ArrayList<>();
    private Snack snack;
    private double price;
    private String name;

    public Combo(Snack snack, double price, String name) {
        this.snack = snack;
        this.price = price;
        this.name = name;
    }

    Combo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void inicializeArray(){
        
     for (int i = 0; i<beverages.size(); i++){
            beverages.set(i, new Beverage());
        }
    }
    
    //public ArrayList
   
    

}
