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
public class Combo {

    private double priceCombo1;
    private double priceCombo2;
    private double priceCombo3;
    private double priceCombo4;
    private String name;
    Snack snack = new Snack();
    Collection combo1;
    Collection combo2;
    Collection combo3;
    Collection combo4;

    Scanner selectCombo = new Scanner(System.in);

    public double calculateCombo1Price() {
        priceCombo1 = 4.0 + 4.5 + 3;

        return priceCombo1;
    }

    public double calculateCombo2Price() {
        priceCombo2 = 13 + 15 + 6;

        return priceCombo2;
    }

    public double calculateCombo3Price() {
        priceCombo3 = 15 + 15 + 7.50 + 6;

        return priceCombo3;
    }

    public double calculateCombo4Price() {
        priceCombo4 = 14 + 12.5 + 25.0 + 13.5 + 5;

        return priceCombo4;
    }

    public void show() {

        System.out.println("-----------------COMBO 1-------------------------------- ");
        System.out.println("|              UNIVERSITY COMBO                         |");
        System.out.println("|       Beverage-->Clasic, 1.5, Switch, 4.0, 1          |");
        System.out.println("|       Beverage-->Clasic, 3.75, Switch, 4.5, 5         |");
        System.out.println("|       Snack--> chips=1, peanut=1, bubblegum=1         |");
        System.out.println("|       PRICE= $11.5                                    |");
        System.out.println("\n\n");
        System.out.println("-----------------COMBO 2-------------------------------- ");
        System.out.println("|              FRIENDS PARTY COMBO                      |");
        System.out.println("|       Beverage-->Whisky, 1, Old times red, 13.0, 15   |");
        System.out.println("|       Beverage-->Whisky, 1, Old times black, 15.0, 16 |");
        System.out.println("|       Snack--> chips=2, peanut=4, bubblegum=0         |");
        System.out.println("|       PRICE= $34                                      |");
        System.out.println("\n\n");
        System.out.println("-------------------COMBO 3---------------------------------");
        System.out.println("|              SI NO ME ACUERDO NO PASÓ                 |");
        System.out.println("|       Beverage-->Beer, 1, Pilsener, 15.0, 13          |");
        System.out.println("|       Beverage-->Beer, 1, Club, 15.0, 14              |");
        System.out.println("|       Beverage-->Ron, 1, Ron pon pon, 7.50, 19        |");
        System.out.println("|       Snack--> chips=1, peanut=2, bubblegum=3         |");
        System.out.println("|       PRICE= $43.5                                    |");
        System.out.println("\n\n");
        System.out.println("----------------------------COMBO 4---------------------------------");
        System.out.println("|              BORRACHOS PERO ESTUDIOSOS                            |");
        System.out.println("|       Beverage-->Wine, 1, Vino Reservado, 14.00, 8                |");
        System.out.println("|       Beverage-->Agua Ardiente, 1,Zhumir Piña Colada, 12.50, 7    |");
        System.out.println("|       Beverage-->Whisky, 1,Jhonny Red Label, 25.0, 18             |");
        System.out.println("|       Beverage-->Clasic, 1, Green mate, 13.5, 9                   |");
        System.out.println("|       Snack--> chips=3, peanut=0, bubblegum=2                     |");
        System.out.println("|       PRICE= $70                                                  |");
        System.out.println("\n\n");
        

    }

    public double select() {

        System.out.println("Please put the number of the combo that you want");
        System.out.println("If you dont need a combo press -->0");

        int comboOption = 0;
        do {
            do {
                try {
                    comboOption = Integer.parseInt(selectCombo.nextLine());
                } catch (Exception exception) {
                    System.out.println("Invalidate option, enter a correct option");
                    continue;
                }
                break;
            } while (true);
        } while (comboOption < 0 || comboOption > 4);

        switch (comboOption) {
            case 1:
                return calculateCombo1Price();

            case 2:
                return calculateCombo2Price();
            case 3:
                return calculateCombo3Price();
            case 4:
                return calculateCombo4Price();
            case 5:
                return 0;
            default:
                return 0.0;
        }

    }

}
