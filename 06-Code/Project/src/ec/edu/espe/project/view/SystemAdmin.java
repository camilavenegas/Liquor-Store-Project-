/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.view;

import ec.edu.espe.project.control.Review;
import ec.edu.espe.project.model.Bill;
import ec.edu.espe.project.model.Customer;
import ec.edu.espe.project.model.Order;
import ec.edu.espe.project.model.ProductMenu;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SystemAdmin {

    public static void main(String[] args) {
        int op = 0;
        Scanner in = new Scanner(System.in);
        Bill bill = new Bill();
        Customer custom = new Customer();
        Review review= new Review();
        do {
            System.out.println("THE LIQUOR STORE AUTOMATION");  
            System.out.println("\t\tGROUP 4");
            System.out.println("The legion of software developers");
            System.out.println("Venegas Camila (L)");
            System.out.println("Velasteguí Alex");
            System.out.println("Toapanta Wilson");
            System.out.println("Paredes Fernando");
            System.out.println("\n\n");
            System.out.println("1.- Explore the liquor store");
            System.out.println("2.- Register data client");
            System.out.println("3.- EXIT");
            op = in.nextInt();
            op= review.validateNegative(op);
                    
            switch (op) {
                case 1:
                    bill.generateBillAmount();
                    bill.createInTheFileManager();
                    break;
                case 2:
                    custom.getCustomerData();
                    break;
                case 3:
                    System.out.println("Thank you :) for your visit");
                    System.out.println("The system has charged your data");
                    break;
            }

        } while (op <= 0 || op > 3 || op != 3);

    }

}
