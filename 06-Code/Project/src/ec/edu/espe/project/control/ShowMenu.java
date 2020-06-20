/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.project.control;

import ec.edu.espe.project.model.Menu;
import java.util.Scanner;

/**
 *
 * @author Wilson Toapanta 6382
 */
public class ShowMenu {
    Scanner dataEntry = new Scanner(System.in);
    Menu menu = new Menu();
    int option;
    int orderOption;
    public int ValidateMenu(){
        System.out.println("Ingrese la opcion que desea conocer: ");
        System.out.println("1.- Ver menu\n2.- Comprar bebida\n3.- Registro de clientes\n4. ");
        do{
            option = dataEntry.nextInt();
            if(option<=0||option>4){
                System.out.println("ERROR. La opcion no está disponible");
                System.out.println("Intentelo nuevamente");
            }else{
                cicle(option);
                
                
            }
            
        }while(option<=0||option>4);
        return 0;
    }
    
    public int cicle(int option){
        switch (option) {
            case 1:
                for (int i = 0; i < 1; i++) {
                    System.out.print(menu.priceSectionA(i));
                }
                for (int i = 0; i < 1; i++) {
                    System.out.println(menu.priceSectionB(i));
                }               
                for (int i = 0; i < 1; i++) {
                    System.out.println(menu.priceSectionC(i));
                }              
                for (int i = 0; i < 1; i++) {
                    System.out.println(menu.priceSectionD(i));
                }                
                System.out.println("Desea ordenar? SI -> 1 / NO -> 0");
                orderOption = dataEntry.nextInt();
                //Con 0 sale de todo el programa
                //Con uno se genera la cuenta, aparece la factura y todas los atributos.
            case 2:
                
        }      
        return 0;
    }
}
