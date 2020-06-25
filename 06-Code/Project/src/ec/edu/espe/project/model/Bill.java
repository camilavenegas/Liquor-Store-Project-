/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Collection;
import ec.edu.espe.filemanager.view.FileManager;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bill {

    private long number;
    private String name;

    public Bill(long number, String name) {
        this.number = 1;
        this.name = "LIQUOR STORE AUTOMATION";

    }
 public Bill() {
        this.number = 0;
        this.name = "";

    }
    Scanner dataEntry= new Scanner(System.in);
    
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    FileManager file = new FileManager("Bills.txt");

    Order order = new Order();

    public double generateBillAmount() {
        double orderTotalPrice = 0;
        int option = 0;
        System.out.println("WELCOME TO THE LIQUOR STORE ");
        System.out.println("1.Create Order\n2.ConfirmOrder\n3.CancelOrder\n4.Exit");
        System.out.println("Please enter your option");
        option=dataEntry.nextInt();
        switch (option) {
            case 1:
                
                double beveragePrice = order.calculateBeveragePrice(order.getBeverage());
                orderTotalPrice += beveragePrice;
                int snackPrice = order.calculateSnackPrice(order.getSnack());
                orderTotalPrice += snackPrice;
                double comboPrice = order.getComboPrice();
                orderTotalPrice += comboPrice;
                break;

            case 2:
                int optionConfirm;
                optionConfirm = order.confirm();
                if(orderTotalPrice==0){
                    System.out.println("You still have not done your order");
                    System.out.println("Please try again");
                }
                if (optionConfirm == 1) {
                    return orderTotalPrice;
                } else {
                    break;
                }
            case 3:
                System.out.println("Are you sure that yoy want to cancel the order?");
                int validateOption = order.confirm();
                if (validateOption == 1) {
                    orderTotalPrice = 0;

                }else
                    break;
            case 4:
                System.out.println("Thanks for your purchase");
                break;

        }
        return orderTotalPrice;
    }

}
