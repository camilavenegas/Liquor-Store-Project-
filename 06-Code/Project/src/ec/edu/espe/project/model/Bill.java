/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import ec.edu.espe.filemanager.view.FileManager;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Bill {

    private long number;
    private String name;
    private Beverage copyBeverage;
    private Snack snack;
    private double totalCost;
  
    FileManager file;
    Order order = new Order();
    Customer customer = new Customer();
    Beverage beverage = new Beverage();

    Scanner dataEntry = new Scanner(System.in);

    public Bill(long number, String name) {
        this.number = 1;
        this.name = "LIQUOR STORE AUTOMATION";

    }
    public Bill() {
        this.number = 0;
        this.name = "";
    }

    public double generateBillAmount() {
        double orderTotalPrice = 0;
        Bill bill = new Bill();
        int option = 0;
        do {
            System.out.println("WELCOME TO THE LIQUOR STORE ");
            System.out.println("1.Create Order\n2.Get Client Data for the Bill\n3.Cancel Order\n4.Exit");
            System.out.println("Please enter your option");
            option = dataEntry.nextInt();

            switch (option) {

                case 1:
                    double beveragePrice = order.calculateBeveragePrice(order.getBeverage());
                    orderTotalPrice += beveragePrice;

                    int snackPrice = order.calculateSnackPrice(order.getSnack());
                    orderTotalPrice += snackPrice;
                    double comboPrice = order.getComboPrice();
                    orderTotalPrice += comboPrice;
                    System.out.println("the order is done now please go to create the data for the bill");
                    break;

                case 2:
                    Customer customer = new Customer();
                    customer = customer.customerData();
                    bill.setCustomer(customer);

                case 3:
                    int optionConfirm;
                    optionConfirm = order.confirm();
                    if (orderTotalPrice == 0) {
                        System.out.println("You still have not done your order");
                        System.out.println("Please try again");
                    }
                    if (optionConfirm == 1) {
                        return orderTotalPrice;
                    } else {
                        break;
                    }

                case 4:
                    System.out.println("Are you sure that yoy want to cancel the order?");
                    int validateOption = order.confirm();
                    if (validateOption == 1) {
                        orderTotalPrice = 0;
                    } else {
                        break;
                    }
                case 5:
                    System.out.println("Thanks for your purchase");
                    break;
            }
        } while (option < 0 || option > 5 || option != 5);
        bill.setTotalCost(orderTotalPrice);
        return orderTotalPrice;
    }

    public Bill getBillData() {
        Bill bill = new Bill();
        bill.getBeverage();
        bill.getCustomer();
        bill.setName("LIQUOR STORE");
        bill.getTotalCost();

        return bill;
    }

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

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return "Bill{" + "number=" + number + ", name=" + name + ", snack=" + snack + ", totalCost=" + totalCost + ", customer=" + customer + ", beverage=" + beverage + '}';
    }

}
