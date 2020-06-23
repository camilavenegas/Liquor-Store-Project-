/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Order {
    private double orderTotalPrice;
    Combo combo = new Combo();
    Beverage beverage = new Beverage();
    Snack snack = new Snack();
    ProductMenu productMenu = new ProductMenu();
    Scanner dataEntry = new Scanner(System.in);
   

    public double getBeverage() {

        double totalPrice = 0;
        double priceCopy;
        Beverage beverageSelected;
        int beverageQuantity;
        int confirmOption;
       productMenu.showBeverage();
       beverageSelected=productMenu.writeBeverage();
        System.out.println("The beverage selected");
        
        System.out.println("How many beverages of this type do you want");
       // beverageQuantity = dataEntry.nextInt();
        //totalPrice += (beverageQuantity * priceCopy);

        return totalPrice;
    }

    public double getSnack() {
        productMenu.showSnack();
        double totalPrice = snack.select();

        return totalPrice;
    }

    public double getCombo() {
        combo.show();
        double comboPrice = combo.select();
        return comboPrice;
    }
    
    public int confirm(){
        int confirmOption=-1;
        System.out.println("Please to confirm the order press 1 or declines press 0");
        confirmOption= dataEntry.nextInt();
       return confirmOption;
    }

    public double create() {
        int optionSubMenu;
        double totalBeverage = 0.0F;
        double totalSnacks = 0.0F;
        double totalCombo = 0.0F;
        int confirmBeverageOrder = -1;
        
        do{

        System.out.println("Choose the following options for your order");
        System.out.println("1. Beverage\n2. Snacks\n3. Combo\n4.Show order price\n5Confirm Order\n6. Exit");
        optionSubMenu = dataEntry.nextInt();
        switch (optionSubMenu) {
          
            case 1:
                totalBeverage += getBeverage();
                do {
                     System.out.println("Would you like to add more beverages to the "
                            + "order");
                    confirmBeverageOrder = confirm();
                    if (confirmBeverageOrder == 1) {
                        totalBeverage += getBeverage();
                        orderTotalPrice+= totalBeverage;
                    } else {
                             }
                } while (confirmBeverageOrder != 1);
                
            case 2:
                totalSnacks= getSnack();
                orderTotalPrice+= totalSnacks;
                
            case 3:
                totalCombo= getCombo();
                orderTotalPrice+=totalCombo;
                
            case 4:
                System.out.println("The total price of your Order is: ");
                System.out.println("--> $"+orderTotalPrice);
                
            case 5:
                int confirmOption= confirm();
                if(confirmOption==0){
                    orderTotalPrice=0;
                }else{
                    System.out.println("Your order has been acomplished");
                }
            break;
   
        }
        }while(optionSubMenu<-1 || optionSubMenu>6 );
      return orderTotalPrice; 
            
    }     
}


