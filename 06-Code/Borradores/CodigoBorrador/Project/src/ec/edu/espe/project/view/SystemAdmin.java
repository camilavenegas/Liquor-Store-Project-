/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.view;

import ec.edu.espe.project.control.FileManager;
import ec.edu.espe.project.model.Bill;
import ec.edu.espe.project.model.Customer;
import ec.edu.espe.project.model.FileBill;
import ec.edu.espe.project.model.MenuAdministrator;
import ec.edu.espe.project.model.Order;
import ec.edu.espe.project.model.Payment;
import ec.edu.espe.project.model.ProductMenu;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author camilavenegas
 */
public class SystemAdmin {

    public static void main(String[] args) throws IOException {

        FileManager fileManager = new FileManager();
        MenuAdministrator menuAdministrator = new MenuAdministrator();

        int op = 0;
        Scanner in = new Scanner(System.in);
        Customer custom = new Customer();
        Bill bill = new Bill();
        Payment pay = new Payment();
        System.out.println("-------------THE LIQUOR STORE AUTOMATION----------");
        System.out.println("\t\t\tGROUP 4\t\t\t\t\t\t\t\t\t\t\t\t");
        System.out.println("|          The legion of software developers            |");
        System.out.println("|           Venegas Camila (L)                          |");
        System.out.println("|           Velasteguí Alex                             |");
        System.out.println("|           Toapanta Wilson                             |");
        System.out.println("|           Paredes Fernando                            |");
        System.out.println("\n\n");
        
        menuAdministrator.menuAdministrator();
        /*
       
*/
    }
}
