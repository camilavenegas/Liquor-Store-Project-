/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.view;


import ec.edu.espe.project.model.Customer;
import ec.edu.espe.project.model.Order;
import ec.edu.espe.project.model.ProductMenu;

/**
 *
 * @author hp
 */
public class SystemAdmin {
    
    public static void main(String[] args) {
        
        //ProductMenu productMenu = new ProductMenu();
        //Order order = new Order();
        
        //order.create();
        //Customer custom = new Customer();
        
        Order order= new Order();
        /*order.getBeverage();
        order.calculateBeveragePrice(order.getBeverage());
        //order.getSnack();
        order.calculateSnackPrice(order.getSnack());*/
        order.getComboPrice();
        
        //custom.cicle();
        
     
    }
    
}
