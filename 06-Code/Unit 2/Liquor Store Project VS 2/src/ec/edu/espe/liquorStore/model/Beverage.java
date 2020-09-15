/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

/**
 *
 * @author Camila Venegas DCCO <your.name at your.org>
 */
public class Beverage extends Product {

    private String type;
    private float size;   


    public Beverage(String type, float size, float price, String brand) {
        super(price, brand);
        this.type = type;
        this.size = size;
    }

    public Beverage() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Beverage{" + "type=" + type + ", size=" + size + '}';
    }

}
