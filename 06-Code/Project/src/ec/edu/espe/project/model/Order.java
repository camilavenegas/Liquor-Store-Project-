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
 * @author camilavenegas
 */
public class Order {

    private Beverage beverage;
    private Snack snack;
    private double orderTotalPrice;

    Collection order;

    Combo combo = new Combo();

    ProductMenu productMenu = new ProductMenu();
    Scanner dataEntry = new Scanner(System.in);

    public Beverage getBeverage() {

        double totalPrice = 0;
        double priceCopy = 0;
        int beverageCode;
        Beverage beverageSelected;
        productMenu.showBeverage();
        beverageCode = productMenu.getBeverage();
        beverageSelected = productMenu.beverages.get(beverageCode);

        return beverageSelected;
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

    public int confirm() {
        int confirmOption = -1;
        System.out.println("Please to confirm the order press 1 or declines press 0");
        confirmOption = dataEntry.nextInt();
        return confirmOption;
    }

    public Order create() {
        int optionSubMenu;
        double totalBeverage = 0.0F;
        double totalSnacks = 0.0F;
        double totalCombo = 0.0F;
        int confirmBeverageOrder = -1;
      
        do {

            System.out.println("Choose the following options for your order");
            System.out.println("1. Beverage\n2. Snacks\n3. Combo\n4. Show order price\n5. Confirm Order\n6. Exit");
            optionSubMenu = dataEntry.nextInt();
            switch (optionSubMenu) {

                case 1:
                   Beverage beverageSelected=new Beverage();
                 
                     order.add(beverageSelected);
                     
  
                case 2:
                    totalSnacks = getSnack();
                    orderTotalPrice += totalSnacks;

                case 3:
                    totalCombo = getCombo();
                    orderTotalPrice += totalCombo;

                case 4:
                    System.out.println("The total price of your Order is: ");
                    System.out.println("--> $" + orderTotalPrice);

                case 5:
                    int confirmOption = confirm();
                    if (confirmOption == 0) {
                        orderTotalPrice = 0;
                    } else {
                        System.out.println("Your order has been acomplished");
                    }
                    break;
            }

        } while (optionSubMenu < -1 || optionSubMenu > 6);
        
        return null;

    }
}
