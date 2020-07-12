/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manejoDeJson.model;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class Beverage {
    private String type;
    private String size;
    private String brand;
    private String price;
    private String code;

    public Beverage(String type, String size, String brand, String price, String code) {
        this.type = type;
        this.size = size;
        this.brand = brand;
        this.price = price;
        this.code = code;
    }
    public Beverage() {
        this.type = "";
        this.size = "";
        this.brand = "";
        this.price = "";
        this.code = "";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Beverage{" + "type=" + type + ", size=" + size + ", brand=" +
                brand + ", price=" + price + ", code=" + code + '}';
    }
    
    
}
