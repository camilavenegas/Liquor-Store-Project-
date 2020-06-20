/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.model;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class Menu {
    //private int DIM = 9;
    double priceSection1[] = {4.00, 6.00, 8.50, 8.50, 4.50, 8.00, 8.50, 11.00, 12.50}; 
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
    }*/
    
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
    }
}
