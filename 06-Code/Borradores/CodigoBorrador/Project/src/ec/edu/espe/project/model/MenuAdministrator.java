/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Scanner;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class MenuAdministrator {

    Scanner options = new Scanner(System.in);
    UserMenu userMenu = new UserMenu();
    int option;

    public void menuAdministrator() {
        do {
            try {
                System.out.println("|***********|ENTER YOUR OPTION|***********|");
                System.out.println("1.Enter the System Admin");
                System.out.println("2.Enter the System USer");
                System.out.println("3.Exit");

                System.out.println("Enter your option: ");
                option = Integer.parseInt(options.nextLine());
            } catch (Exception exception) {
                System.out.println("Please Enter Only Numbers!!");
            }
            switch (option) {
                case 1:
                    break;
                case 2:
                    userMenu.menuUser();
                    break;
                case 3:
                    System.out.println("THANKS!");
                    break;

                default:
                    System.out.println("ERROR!! Please select a valid option");
                    break;
            }

        } while (option != 3);

    }
}
