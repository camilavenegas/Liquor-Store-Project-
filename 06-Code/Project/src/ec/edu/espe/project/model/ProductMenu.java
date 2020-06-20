/*
 * To change this license header, showBeverage License Headers in Project Properties.
 * To change this template file, showBeverage Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class ProductMenu {
    
    
    Beverage beverage= new Beverage(); 
    Collection <Beverage> beverages= new ArrayList<>();
    
    Snack snack = new Snack();
    Collection <Snack> snacks = new ArrayList<>();
    
    public Beverage showBeverage(){
        
    beverages.add(new Beverage("Clasic", 1.5, "Switch", 4.0, 1));
    beverages.add(new Beverage("Clasic", 1.5, "Paisa", 6.0, 2));
    beverages.add(new Beverage("Clasic", 1, "Cristal", 8.5, 3));   
    beverages.add(new Beverage("Clasic", 0.75, "Trópico", 8.5, 4));
    beverages.add(new Beverage("Clasic", 3.75, "1/2 Norteño", 4.5, 5));
    beverages.add(new Beverage("Agua Ardiente", 1.5, "Zhumir", 8.5, 6));
    beverages.add(new Beverage("Clasic", 1, "Norteño", 8.5, 7));
    beverages.add(new Beverage("Agua Ardiente", 1, "Zhumir Pink", 11.0, 8));
    beverages.add(new Beverage("Agua Ardiente", 1, "Zhumir piña colada", 12.50, 9));
    beverages.add(new Beverage("Clasic", 1, "Mira flores", 8.0, 10));
    beverages.add(new Beverage("Clasic", 1, "3 medalla paras", 12.5, 11));
    beverages.add(new Beverage("Wine", 1, "Vino reservado", 14.00, 12));
    beverages.add(new Beverage("Clasic", 1, "Green mate", 13.5, 13));
    beverages.add(new Beverage("Agua Ardiente", 1, "Charro", 19.0, 14));
    beverages.add(new Beverage("Clasic", 1, "Jager Meister", 34.0, 15));
    beverages.add(new Beverage("Vodka", 1, "Smirnof", 15.0, 16));
    beverages.add(new Beverage("Vodka", 1, "Absolute", 23.0, 17));
    beverages.add(new Beverage("Clasic", 1, "Gim", 15.0, 18));
    beverages.add(new Beverage("Clasic", 1, "Under", 15.0, 19));
    beverages.add(new Beverage("Whisky", 1, "1/2 old times rojo ", 8.0, 20));
    beverages.add(new Beverage("Whisky", 1, "1/2 old times negro", 9.0, 21));
    beverages.add(new Beverage("Whisky", 1, "Whisky Lenget", 12.0, 22));
    beverages.add(new Beverage("Whisky", 1, "Old times rojo", 13.0, 23));
    beverages.add(new Beverage("Whisky", 1, "Black Castell", 14.0, 24));
    beverages.add(new Beverage("Whisky", 1, "Old times negro", 15.00, 25));
    beverages.add(new Beverage("Whisky", 1, "Jhon Morris negro", 16.00, 26));
    beverages.add(new Beverage("Whisky", 1, "Bellows", 16.00, 27));
    beverages.add(new Beverage("Whisky", 1, "Grants", 22.00, 28));
    beverages.add(new Beverage("Whisky", 1, "Jhonny rojo", 25.0, 29));
    beverages.add(new Beverage("Ron", 1, "1/2 Ron pon pon", 4.00, 30));
    beverages.add(new Beverage("Ron", 1, "1/2 Ron abuelo", 6.50, 31));
    beverages.add(new Beverage("Ron", 1, "Ron pon pon", 7.50, 32));
    beverages.add(new Beverage("Ron", 1, "San Miguel oro y plata", 11.00, 33));
    beverages.add(new Beverage("Whisky", 1, "Castillo blanco", 11.0, 34));
    beverages.add(new Beverage("Ron", 1, "Ron abuelo", 14.0, 35));
    beverages.add(new Beverage("Ron", 1, "Garrafa abuelo", 26.00, 36));
    beverages.add(new Beverage("Whisky", 1, "Jack Daniels", 68.0, 37));
    
    beverages.forEach((bev)->{
            System.out.println("Beverage: " + bev);
        });
    
    
    return null;
}
    public Snack showSnack(){
        System.out.println("Snacks avalibles");
        System.out.println("1.- Chips           $1.0");
        System.out.println("2.- Peanut          $1.0");
        System.out.println("3.- Bubblegum       $1.0");

        return null;
    }
   
    

    //private int DIM = 9;
    /*double priceSection1[] = {4.00, 6.00, 8.50, 8.50, 4.50, 8.00, 8.50, 11.00, 12.50}; 
    double priceSection2[] = {8.00, 12.00, 14.00, 13.50, 19.00, 34.00, 15.00, 23.00, 15.00, 15.50};
    double priceSection3[] = {8.00, 9.00, 12.00, 13.00, 14.00, 15.00, 16.00, 16.00, 22.00, 25.00};
    double priceSection4[] = {4.00, 6.50, 7.50, 11.00, 11.00, 14.00, 26.00};
    /*int DIM1;
    int DIM2;       
    int DIM3;
    int DIM4;
    
    public int DIM1(){      //Dimensión del vector para obtener elemento por elemento
        DIM1 = priceSection1.length;
        return DIM1;
    }
    public int DIM2(){
        DIM2 = priceSection2.length;
        return DIM2;
    }
    public int DIM3(){
        DIM3 = priceSection3.length;
        return DIM3;
    }
    public int DIM4(){
        DIM4 = priceSection4.length;
        return DIM4;
    }
    
    public int priceSectionA(int i){
        System.out.println("Switch                  $" + priceSection1[i]);
        System.out.println("Paisa                   $" + priceSection1[i+1]);
        System.out.println("Cristal                 $" + priceSection1[i+2]);
        System.out.println("Trópico                 $" + priceSection1[i+3]);
        System.out.println("1/2 norteño             $" + priceSection1[i+4]);
        System.out.println("Zhumir                  $" + priceSection1[i+5]);
        System.out.println("Norteño                 $" + priceSection1[i+6]);
        System.out.println("Zhumir Pink             $" + priceSection1[i+7]);
        System.out.println("Zhumir piña colada      $" + priceSection1[i+8]);
        return 0;
    }
    public double priceSectionB(int i){
        System.out.println("\n");
        System.out.println("Mira flores             $" + priceSection2[i]);
        System.out.println("3 medallas paras        $" + priceSection2[i+1]);
        System.out.println("Vino reservado          $" + priceSection2[i+2]);
        System.out.println("Green mate              $" + priceSection2[i+3]);
        System.out.println("Charro                  $" + priceSection2[i+4]);
        System.out.println("Jager                   $" + priceSection2[i+5]);
        System.out.println("Smirnof                 $" + priceSection2[i+6]);
        System.out.println("Absolute                $" + priceSection2[i+7]);
        System.out.println("Grimm                   $" + priceSection2[i+8]);
        System.out.println("Under                   $" + priceSection2[i+9]);
        return 0;
    }
    public double priceSectionC(int i){
        System.out.println("\n");
        System.out.println("1/2 Old times rojo      $" + priceSection3[i]);
        System.out.println("1/2 Old times negro     $" + priceSection3[i+1]);
        System.out.println("Whisky Lengent          $" + priceSection3[i+2]);
        System.out.println("Old times rojo          $" + priceSection3[i+3]);
        System.out.println("Black Castell           $" + priceSection3[i+4]);
        System.out.println("Old times negro         $" + priceSection3[i+5]);
        System.out.println("John Morris negro       $" + priceSection3[i+6]);
        System.out.println("Bellows                 $" + priceSection3[i+7]);
        System.out.println("Grants                  $" + priceSection3[i+8]);
        System.out.println("Jhonny rojo             $" + priceSection3[i+9]);
        return 0;
    }
    public double priceSectionD(int i){
        System.out.println("\n");
        System.out.println("1/2 Ron pon pon         $" + priceSection4[i]);
        System.out.println("1/2 ron abuelo          $" + priceSection4[i+1]);
        System.out.println("Ron pon pon             $" + priceSection4[i+2]);
        System.out.println("San Miguel oro y plata  $" + priceSection4[i+3]);
        System.out.println("Castillo blanco         $" + priceSection4[i+4]);
        System.out.println("Ron abuelo              $" + priceSection4[i+5]);
        System.out.println("Garrafa Abuelo          $" + priceSection4[i+6]);
        return 0;
    }*/
    
}
