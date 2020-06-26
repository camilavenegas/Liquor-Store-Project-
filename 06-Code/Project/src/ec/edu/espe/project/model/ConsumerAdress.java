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
    private String crossingStreet;
    private String houseNumber;

    Scanner dataEntry = new Scanner(System.in);

    public ConsumerAdress(String principalStreet, String houseNumber, String crossingStreet) {
        this.principalStreet = principalStreet;
        this.houseNumber = houseNumber;
        this.crossingStreet = crossingStreet;
    }

    public ConsumerAdress() {
        this.principalStreet = "";
        this.houseNumber = "";
        this.crossingStreet = "";
    }

    public String getPrincipalStreet() {
        return principalStreet;
    }

    public void setPrincipalStreet(String principalStreet) {
        this.principalStreet = principalStreet;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCrossingStreet() {
        return crossingStreet;
    }

    public void setCrossingStreet(String crossingStreet) {
        this.crossingStreet = crossingStreet;
    }

    public String writePrincipalStreet() {
        System.out.println("Please write the Principal Street of your adress");
        principalStreet = dataEntry.nextLine();
        return principalStreet;

    }

    public String writeCrossingStreet() {
        System.out.println("Please write the crossing street of your adress");
        crossingStreet = dataEntry.nextLine();
        return crossingStreet;
    }

    public String writeHouseNumber() {
        System.out.println("Please write the number of your house--> Ex: E7-120");
        houseNumber= dataEntry.nextLine();
        return houseNumber;
    }

    @Override
    public String toString() {
        return "ConsumerAdress{" + principalStreet  + crossingStreet  + houseNumber  + dataEntry + '}';
    }
    
    

}
