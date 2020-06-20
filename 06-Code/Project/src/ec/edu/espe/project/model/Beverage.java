/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author hp
 */
public class Beverage {
    
     private String type;
     private double size;
     private String brand;
     private double price;
     private int code;

    public Beverage(String type, double size, String brand, double price, int code) {
        this.type = type;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.code = code;
    }

    Beverage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

   

    @Override
    public String toString() {
        return "Beverage{" + "type=" + type + ", size=" + size + ", brand=" + brand + ", price=" + price + ", code=" + code + '}';
    }

    public int choose(){
        Collection<Beverage> beverages=new ArrayList<>();
    
}
     
     
    
}
