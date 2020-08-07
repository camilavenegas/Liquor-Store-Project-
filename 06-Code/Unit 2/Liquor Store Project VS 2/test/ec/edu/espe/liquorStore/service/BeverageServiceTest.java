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

    /**
     * Test of getBeverageTypes method, of class BeverageService.
     */
    @Test
    public void testGetBeverageTypes() {
        System.out.println("getBeverageTypes");
        BeverageService instance = new BeverageService();
        List<String> expResult = null;
        List<String> result = instance.getBeverageTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllBeverages method, of class BeverageService.
     */
    @Test
    public void testGetAllBeverages() {
        System.out.println("getAllBeverages");
        BeverageService instance = new BeverageService();
        List<Beverage> expResult = null;
        List<Beverage> result = instance.getAllBeverages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBeverage method, of class BeverageService.
     */
    @Test
    public void testAddBeverage() {
        System.out.println("addBeverage");
        String brand = "";
        String type = "";
        float price = 0.0F;
        float size = 0.0F;
        BeverageService instance = new BeverageService();
        instance.addBeverage(brand, type, price, size);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
