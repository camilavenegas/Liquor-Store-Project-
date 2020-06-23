/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.Scanner;


/**
 *
 * @author hp
 */
public class Beverage {
    
     private String type;
     private double size;
     private String brand;
     private double price;
     private int code;
     
     Scanner codeBeverage = new Scanner(System.in);
    public Beverage(String type, double size, String brand, double price, int code) {
        this.type = type;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.code = code;
    }
    public Beverage(){
        this.type = "";
        this.brand = "";
        this.size = 0;
        this.code = 0;
        this.price = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Scanner getCodeBeverage() {
        return codeBeverage;
    }

    public void setCodeBeverage(Scanner codeBeverage) {
        this.codeBeverage = codeBeverage;
    }
    
   

    @Override
    public String toString() {
        return "Beverage{" + "type=" + type + ", size=" + size + ", brand=" + brand + ", price=" + price + ", CODE=" + code + '}';
    }
    
    public int choose(){
        System.out.println("Select the beverage by the CODE: ");
        int copyCode;
        copyCode = codeBeverage.nextInt();

        return copyCode-1;
    } 
    
    

     
     
    
}
