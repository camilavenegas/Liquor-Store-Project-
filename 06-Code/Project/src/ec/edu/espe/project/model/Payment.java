/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

/**
 *
 * @author camilavenegas
 */
public class Payment {

     Payment factured;
    public void payWithCard(Card card, double cost) {
     
        System.out.println(card.toString());
        double payment=cost;
        System.out.println("Your pay has been completed");
        System.out.println("Thanks, and enjoy the PARTY ☻");
      
    }

    public void payWithCash(double cash) {
        double totalPrice = cash; 
        System.out.println("Your payment has been completed");
        System.out.println("Enjoy the Party ☻");
      
    }

    public void pay( double totalCost){
        System.out.println("This is the pay method");
        System.out.println("You have two options for paying");
        System.out.println("\n1. Pay with Cash\n2. Pay with Card\n3. Exit");
        System.out.println("SELECT AN OPTION");
        
        int option=0;
        switch(option){
            case 1:
                factured.payWithCash(totalCost);
                break;
            case 2:
                Card card= new Card();
                factured.payWithCard(card.getCardData(),totalCost);
                break;
            case 3:
                
                break;
                
                
        }
        
    }
            
}
