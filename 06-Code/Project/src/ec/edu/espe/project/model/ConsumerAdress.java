/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Scanner;

/**
 *
 * @author camilavenegas
 */
public class ConsumerAdress {
    private String principalStreet;
    private String houseNumber;
    private String crossingStreet;
    
    Scanner dataEntry= new Scanner(System.in);

    public ConsumerAdress(String principalStreet, String houseNumber, String crossingStreet) {
        this.principalStreet = principalStreet;
        this.houseNumber = houseNumber;
        this.crossingStreet = crossingStreet;
    }
    public ConsumerAdress(){
        this.principalStreet = "";
        this.houseNumber = "";
        this.crossingStreet = "";
    }

    public String getPrincipalStreet() {
        return principalStreet;
    }

    public String setPrincipalStreet() {
        System.out.println("Write the princpial Street of your Adress");
        this.principalStreet = dataEntry.nextLine();
        return principalStreet;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String setHouseNumber() {
        System.out.println("Write your house number--> E7-120");
        this.houseNumber = dataEntry.nextLine();
        return houseNumber;
    }

    public String getCrossingStreet() {
        return crossingStreet;
    }

    public String setCrossingStreet() {
        System.out.println("Write the crossing street of your Adress");
        this.crossingStreet = dataEntry.nextLine();
        return crossingStreet;
    }
    
    
}

