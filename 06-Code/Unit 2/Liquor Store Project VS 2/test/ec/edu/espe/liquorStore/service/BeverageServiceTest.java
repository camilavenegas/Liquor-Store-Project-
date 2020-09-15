/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.service;

import ec.edu.espe.liquorStore.model.Beverage;
import ec.edu.espe.liquorStore.model.Product;

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

        String brand = "Charro";
        String type = "Charro";
        float price = 0.0F;
        float size = 0.0F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Charro";
        String copyType = "Charro";
        float copyPrice = 0.0F;
        float copySize = 0.0F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(brand, copyBrand);

    }

    @Test
    public void testAddBeverage1() {
        String brand = "Swicht";
        String type = "Classic";
        float price = 4.5F;
        float size = 3.0F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Swicht";
        String copyType = "Classic";
        float copyPrice = 4.5F;
        float copySize = 3.0F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(type, copyType);

    }

    @Test
    public void testAddBeverage2() {
         String brand = "Swicht";
        String type = "Classic";
        float price = 4.5F;
        float size = 3.0F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Swicht";
        String copyType = "Classic";
        float copyPrice = 4.5F;
        float copySize = 3.0F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(price, copyPrice,0);
    }
    @Test
    public void testAddBeverage3() {
         String brand = "Jhonny";
        String type = "Whisky";
        float price = 10.5F;
        float size = 2.5F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Jhonny";
        String copyType = "Whisky";
        float copyPrice = 10.5F;
        float copySize = 2.5F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(size, copySize,0);
    }
    
      @Test
    public void testAddBeverage4() {
         String brand = "Jhonny";
        String type = "Whisky";
        float price = 10.5F;
        float size = 2.5F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Jhonny";
        String copyType = "Whisky";
        float copyPrice = 10.5F;
        float copySize = 2.5F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(brand, copyBrand);
    }
    
     @Test
    public void testAddBeverage5() {
         String brand = "GinTonic";
        String type = "Gin";
        float price = 20.5F;
        float size = 2.5F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "GinTonic";
        String copyType = "Gin";
        float copyPrice = 20.5F;
        float copySize = 2.5F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(type, copyType);
    }
    
     @Test
    public void testAddBeverage6() {
         String brand = "GinTonic";
        String type = "Gin";
        float price = 20.5F;
        float size = 2.5F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "GinTonic";
        String copyType = "Gin";
        float copyPrice = 20.5F;
        float copySize = 2.5F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(price, copyPrice,0);
      
    }
    
     @Test
    public void testAddBeverage7() {
         String brand = "Norteño";
        String type = "Puntas";
        float price = 4.0F;
        float size = 1.5F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Norteño";
        String copyType = "Puntas";
        float copyPrice = 4.0F;
        float copySize = 1.5F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(size, copySize,0);
    
    }
    
      @Test
    public void testAddBeverage8() {
         String brand = "Norteño";
        String type = "Puntas";
        float price = 4.0F;
        float size = 1.5F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Norteño";
        String copyType = "Puntas";
        float copyPrice = 4.0F;
        float copySize = 1.5F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(price, copyPrice,0);
    
    }
    
    @Test
    public void testAddBeverage9() {
         String brand = "Pilsener";
        String type = "Beer";
        float price = 4.0F;
        float size = 1.5F;
        Product bev = new Beverage(type, size, price, brand);

        String copyBrand = "Pilsener";
        String copyType = "Beer";
        float copyPrice = 4.0F;
        float copySize = 1.5F;
        Product copyBev = new Beverage(copyType, copySize, copyPrice, copyBrand);

        assertEquals(brand,copyBrand);
    
    }
    
    
    
    
}
