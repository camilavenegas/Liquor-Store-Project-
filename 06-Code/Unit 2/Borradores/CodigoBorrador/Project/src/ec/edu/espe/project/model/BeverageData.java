/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

/**
 *
 * @author Alex Velastegui ESPE-DCCO
 */
public class BeverageData {

    public String type;
    public String brand;
    public double size;
    public double price;
    public int code;

    public BeverageData(String type, String brand, double size, double price, int code) {
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.code = code;
    }

    @Override
    public String toString() {
        return type + "," + brand + "," + size + "," + price + "," + code;
    }

}
