/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author camilavenegas
 */
public class Order {

    ProductMenu menu = new ProductMenu();
    Beverage beverage = new Beverage();
    Snack snack = new Snack();
    Combo combo = new Combo();

    public Beverage getBeverage() {
        beverage = menu.chooseBeverage();

        return beverage;
    }
   
    public double calculateBeveragePrice(Beverage beverage) {
        double price = beverage.getPrice();
        System.out.println("$" + price);

        return price;
    }

    public Snack getSnack() {
        snack.setChip(snack.selectChips());
        snack.setPeanut(snack.selectPeanut());
        snack.setBubblegum(snack.selectBubblegum());
        System.out.println("The order is" + snack.toString());

        return snack;
    }

    public int calculateSnackPrice(Snack snack) {
        int chips = snack.getChip();
        int peanut = snack.getPeanut();
        int bubblegum = snack.getBubblegum();
        int totalPrice = chips + peanut + bubblegum;
        System.out.println("The total price of your Snack order is-->" + totalPrice);

        return totalPrice;
    }

    public double getComboPrice() {
        //combo.show();
        double price = combo.select();
        if (price == 11.5) {
            System.out.println("Yoy have choose the Univesity Combo");
            System.out.println("And the price is-->$" + price);
        } else if (price == 30) {
            System.out.println("You have choosen the Friends Party Combo");
            System.out.println("And the price is-->$" + price);
        } else if (price == 43.5) {
            System.out.println("You have choosen the Combo 'SI NO ME ACUERDO NO PASO'");
            System.out.println("And the price is-->$" + price);

        }else 
            System.out.println("You have choosen the Combo 'BORRACHOS PERO ESTUDIOSOS");
            System.out.println("And the price is-->$"+price);

        return price;
    }
    Scanner dataEntry= new Scanner(System.in);
    public int confirm() {
        int confirmOption = -1;
        System.out.println("Please to confirm the order press 1 or declines press 0");
        confirmOption = dataEntry.nextInt();
        return confirmOption;
    }
}
