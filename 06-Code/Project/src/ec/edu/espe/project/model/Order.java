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
public class Order {
    Scanner dataEntry = new Scanner(System.in);
    
    Combo combo= new Combo();
    Beverage beverage = new Beverage();
    Snack snack = new Snack();    
    
    double[]priceVector ={4.0,8.5,8.5,8.5,8.5,11.0,12.5,14.0,13.5,34.0,15.0,23.0,
        15.0,15.0,13.0,15.0,16.0,25.0,7.5,14.0,26.0,68.0};
    
    public double getBeverage(){
    int [] code;
    int i;
    int beverageLimit;
        System.out.println("How many beverage do you want? ");
        beverageLimit=dataEntry.nextInt();
        if(beverageLimit==0){           
            return 0;
        }else{       
            do{
                for(i=0;i<=beverageLimit;i++){
                code[] = beverage.choose();
                System.out.println("Do you want to add more beverages? Yes=1/No=0");
                

                }    
            }while(); 
         
        }
    }   
}
