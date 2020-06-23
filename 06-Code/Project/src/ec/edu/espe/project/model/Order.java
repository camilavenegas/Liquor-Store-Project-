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

    Scanner dataEntry = new Scanner(System.in);

    Combo combo = new Combo();
    Beverage beverage = new Beverage();
    Snack snack = new Snack();
    ProductMenu productMenu = new ProductMenu();

    private double orderTotalPrice;

    //double[] priceVector = {4.0, 8.5, 8.5, 8.5, 8.5, 11.0, 12.5, 14.0, 13.5, 34.0, 15.0, 23.0,
    //15.0, 15.0, 13.0, 15.0, 16.0, 25.0, 7.5, 14.0, 26.0, 68.0};
    public double getBeverage() {

        double totalPrice = 0;
        double priceCopy;
        int beverageQuantity;
        int confirmOption;

        priceCopy = productMenu.showBeverage();
        System.out.println("How many beverages of this type do you want");
        beverageQuantity = dataEntry.nextInt();
        totalPrice += (beverageQuantity * priceCopy);

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

    public double create() {
        int optionSubMenu;
        double totalBeverage = 0.0F;
        double totalSnacks = 0.0F;
        double totalCombo = 0.0F;
        int confirmOrder = -1;

        System.out.println("Choose the following options for your order");
        System.out.println("1. Beverage\n2. Snacks\n3. Combo\n4.Exit");
        optionSubMenu = dataEntry.nextInt();
        switch (optionSubMenu) {
            case 1:
                totalBeverage += getBeverage();
                do {

                    System.out.println("Would you like to add more beverages to the "
                            + "order");
                    System.out.println("To confirm the order press 1  or to decline "
                            + "press 0");

                    confirmOrder = dataEntry.nextInt();
                    if (confirmOrder == 1) {
                        totalBeverage += getBeverage();
                    } else {

                    }
                } while (confirmOrder != 1);

        }
    }
}
