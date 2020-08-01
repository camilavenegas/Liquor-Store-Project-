/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import ec.edu.espe.project.control.SearchDocument;
import java.util.Scanner;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class SignUpBeverage {

    public void singInBeverage() {
        Scanner scanner = new Scanner(System.in);
        SearchDocument file = new SearchDocument("beverages.csv");

        boolean repeat = false;
        String type;
        String brand;
        String answer;
        String newPass;
        double size;
        double price;
        int code;

        do {
            System.out.println("Enter a type: ");
            type = scanner.nextLine();

            System.out.println("Enter a brand: ");
            brand = scanner.nextLine();

            System.out.println("Enter a size: ");
            size = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter a price: ");
            price = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter a code: ");
            code = Integer.parseInt(scanner.nextLine());

            BeverageData beverage = new BeverageData(type, brand, size, price, code);
            String[] contact = (beverage.toString().split(","));
            BeverageData beverageArray = new BeverageData(contact[0],contact[1],contact[2],contact[3],contact[4]);
            file.writeFile(beverageArray);

            System.out.println("Would you like to sign another beverage? [yes/no]");
            answer = scanner.nextLine();
            if ("no".equals(answer)) {
                repeat = true;
            }

        } while (repeat = false);

    }
}
