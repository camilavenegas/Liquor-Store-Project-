/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.service;

import ec.edu.espe.liquorStore.model.Beverage;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Paredes
 */
public class BeverageServiceTest {
    
    public BeverageServiceTest() {
    }

    
    @Test
    public void testAddBeverage() {
        
        String brand = "";
        String type = "";
        float price = 0.0F;
        float size = 0.0F;
        Beverage bev= new Beverage(type, brand, price, size);
        
        String copyBrand= "";
        String copyType="";
        float copyPrice=0.0F;
        float copySize=0.0F;
        Beverage copyBev= new Beverage(copyType, copyBrand, copyPrice, copySize);
        
        assertEquals(bev, copyBev);
        fail("The test case is a prototype.");
    }
    
    @Test
     public void testAddBeverage1() {
          String brand = "Jhonny";
        String type = "Tequila";
        float price = 10.0F;
        float size = 1.0F;
        Beverage bev= new Beverage(type, brand, price, size);
        
        String copyBrand= "Jhonny";
        String copyType="Tequila";
        float copyPrice=10.0F;
        float copySize=1.0F;
        Beverage copyBev= new Beverage(copyType, copyBrand, copyPrice, copySize);
        
        assertEquals(bev, copyBev);
        fail("The test case is a prototype.");
         
      
    }
      @Test
     public void testAddBeverage2() {
       String brand = "Gin";
        String type = "Ginebra";
        float price = 20.0F;
        float size = 1.5F;
        Beverage bev= new Beverage(type, brand, price, size);
        
        String copyBrand= "Gin";
        String copyType="Ginebra";
        float copyPrice=02.0F;
        float copySize=1.5F;
        Beverage copyBev= new Beverage(copyType, copyBrand, copyPrice, copySize);
        
        assertEquals(bev, copyBev);
        fail("The test case is a prototype.");
    }
     
     
}
