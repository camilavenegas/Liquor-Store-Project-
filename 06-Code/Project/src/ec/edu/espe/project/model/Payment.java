/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author camilavenegas
 */
public class Payment {
    private double  totalCost;
    
     
     Scanner dataEntry= new Scanner(System.in);
      int option=0;

    public void payWithCard(Card card) {
     
        System.out.println(card);
        
        System.out.println("Your pay has been completed");
        System.out.println("Thanks, and enjoy the PARTY ☻");
      
    }

    public void payWithCash(double cost) {
         
        System.out.println("Your payment has been completed");
        System.out.println("The order Total Cost is=$"+cost);
        System.out.println("Enjoy the Party ☻");
      
    }

    public void pay( double totalOrderCost){
        System.out.println("This is the pay method");
        System.out.println("You have two options for paying");
        System.out.println("\n1. Pay with Cash\n2. Pay with Card\n3. Exit");
        System.out.println("SELECT AN OPTION");
        do {
                try {
                    option = Integer.parseInt(dataEntry.nextLine());
                } catch (Exception exception) {
                    System.out.println("Invalidate option, enter a correct option");
                    continue;
                }
                break;
            } while (true);
       
        switch(option){
            case 1:
               payWithCash(totalOrderCost);
                break;
            case 2:
                Card card= new Card();
                payWithCard(card.getCardData());
                break;
            case 3:
                
                break;
                
                
        }
        
    }
            
}
