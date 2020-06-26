/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.view;

import ec.edu.espe.project.control.FileManager;
import ec.edu.espe.project.control.Review;
import ec.edu.espe.project.model.Bill;
import ec.edu.espe.project.model.Customer;
import ec.edu.espe.project.model.FileBill;
import ec.edu.espe.project.model.Order;
import ec.edu.espe.project.model.Payment;
import ec.edu.espe.project.model.ProductMenu;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SystemAdmin {

    public static void main(String[] args) throws IOException {
        
        FileManager fileManager = new FileManager();
                
        int op = 0;
        Scanner in = new Scanner(System.in);
        Customer custom = new Customer();
        Bill bill = new Bill();
        Review review= new Review();
        Payment pay= new Payment();
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
<<<<<<< HEAD
            
            do{
            try{
                op = Integer.parseInt(in.nextLine());               
            }catch (Exception exception) {
                System.out.println("Invalidate option, enter a correct option");
                continue;
            }
            break;
        }while(true);
            /*do{
            try{
                op = in.nextInt();
                in.nextLine();
            }catch(NumberFormatException exception){
                continue;
            }
            break;
        }while(true);*/
            
                    
            switch (op) {
=======
            op = in.nextInt();
            
                     switch (op) {
>>>>>>> 4ed4aaa45616567a0d0a6229807ffbd4ece4df1d
                case 1:
                    double totalValue=bill.generateBillAmount();
                    System.out.println("Thaks for your purchase ☻");
                    System.out.println("The total cost for your order is "+totalValue);
                    
                    System.out.println("Go to the pay method");
                    pay.pay(totalValue);
                    
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

