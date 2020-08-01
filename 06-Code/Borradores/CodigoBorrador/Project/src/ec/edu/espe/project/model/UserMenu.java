/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import ec.edu.espe.project.control.FileManager;
import java.util.Scanner;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class UserMenu {

    FileManager fileManager = new FileManager();

    public void menuUser() {
        int op = 0;
        Scanner in = new Scanner(System.in);
        Customer custom = new Customer();
        Bill bill = new Bill();
        Payment pay = new Payment();
        do {

            System.out.println("1.- Explore the Liquor Store  ");
            System.out.println("2.- Add A Client to the DataBase ");
            System.out.println("3.- EXIT");

            do {
                try {
                    op = Integer.parseInt(in.nextLine());
                } catch (Exception exception) {
                    System.out.println("Invalidate option, enter a correct option");
                    continue;
                }
                break;
            } while (true);
            switch (op) {

                case 1:
                    double totalValue = bill.generateBillAmount();

                    break;

                case 2:
                    fileManager.register();
                    break;
                case 3:
                    System.out.println("Thank you :) for your visit");
                    System.out.println("The system has charged your data");
                    break;
            }

        } while (op <= 0 || op > 3 || op != 3);
    }

}
