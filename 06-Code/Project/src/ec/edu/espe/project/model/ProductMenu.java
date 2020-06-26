/*
 * To change this license header, showBeverage License Headers in Project Properties.
 * To change this template file, showBeverage Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class ProductMenu {
    
    Beverage beverage = new Beverage();
    ArrayList<Beverage> beverages = new ArrayList<>();

    Snack snack = new Snack();
    ArrayList<Snack> snacks = new ArrayList<>();
    
    public Beverage chooseBeverage() {

        beverages.add(new Beverage("Clasic", 1.5, "Switch", 4.0, 1));
        beverages.add(new Beverage("Clasic", 1, "Cristal", 8.5, 2));
        beverages.add(new Beverage("Clasic", 0.75, "Trópico", 8.5, 3));
        beverages.add(new Beverage("Agua Ardiente", 1.5, "Zhumir", 8.5, 4));
        beverages.add(new Beverage("Clasic", 1, "Norteño", 8.5, 5));
        beverages.add(new Beverage("Agua Ardiente", 1, "Zhumir Pink", 11.0, 6));
        beverages.add(new Beverage("Agua Ardiente", 1, "Zhumir Piña Colada", 12.50, 7));
        beverages.add(new Beverage("Wine", 1, "Vino Reservado", 14.00, 8));
        beverages.add(new Beverage("Clasic", 1, "Green mate", 13.5, 9));
        beverages.add(new Beverage("Clasic", 1, "Jager Meister", 34.0, 10));
        beverages.add(new Beverage("Vodka", 1, "Smirnof", 15.0, 11));
        beverages.add(new Beverage("Vodka", 1, "Absolute", 23.0, 12));
        beverages.add(new Beverage("Beer", 1, "Pilsener", 15.0, 13));
        beverages.add(new Beverage("Beer", 1, "Club", 15.0, 14));
        beverages.add(new Beverage("Whisky", 1, "Old times red", 13.0, 15));
        beverages.add(new Beverage("Whisky", 1, "Old times black", 15.00, 16));
        beverages.add(new Beverage("Whisky", 1, "Bellows", 16.00, 17));
        beverages.add(new Beverage("Whisky", 1, "Jhonny Red Label", 25.0, 18));
        beverages.add(new Beverage("Ron", 1, "Ron pon pon", 7.50, 19));
        beverages.add(new Beverage("Ron", 1, "Ron abuelo", 14.0, 20));
        beverages.add(new Beverage("Ron", 1, "Garrafa abuelo", 26.00, 21));
        beverages.add(new Beverage("Whisky", 1, "Jack Daniels", 68.0, 22));
        
       beverages.forEach((bev) -> {
            System.out.println("Beverage: " + bev);
            });
            int copyCode= beverage.choose();
            for(int i=0; i<beverages.size();i++){
                if(beverages.get(i).getCode()==copyCode){
                    System.out.println("The BEVERAGE choosen"+beverages.get(i));
                }
            }
            return beverages.get(copyCode);
            
        
        
    }

    public void showSnack() {
        System.out.println("Snacks avalibles");
        System.out.println("1.- Chips           $1.0");
        System.out.println("2.- Peanut          $1.0");
        System.out.println("3.- Bubblegum       $1.0");

        
    }
    
     public int getBeverage(){
         int copyBeverageCode= beverage.choose();     
         //double copyPrice= beverages.get(copyBeverageCode).getPrice();
          return(copyBeverageCode);
     }
    /*
    public Beverage writeBeverage(){
        int copyBeverageCode= beverage.choose();
         Beverage beverageSelected= beverages.get(copyBeverageCode);
       
       return beverageSelected;    
    }*/
    
   
}
