/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Venegas DCCO <your.name at your.org>
 */
public class ValidatorTest {
    
    public ValidatorTest() {
    }

  
    @Test
    public void testCheckCard() {
        System.out.println("checkCard");
        String card = "";
        boolean expResult = false;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCheckCard1() {
        System.out.println("checkCard");
        String card = "5186109617131192";
        boolean expResult = true;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckCard2() {
        System.out.println("checkCard");
        String card = "5186109617131134";
        boolean expResult = false;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckCard3() {
        System.out.println("checkCard");
        String card = "5577780643262156";
        boolean expResult = true;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCheckCard4() {
        System.out.println("checkCard");
        String card = "5200838394932123";
        boolean expResult = true;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCheckCard5() {
        System.out.println("checkCard");
        String card = "5595579108878623";
        boolean expResult = true;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCheckCard6() {
        System.out.println("checkCard");
        String card = "5595579108878756";
        boolean expResult = false;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckCard7() {
        System.out.println("checkCard");
        String card = "5273251288803040";
        boolean expResult = true;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCheckCard8() {
        System.out.println("checkCard");
        String card = "5218403275534132";
        boolean expResult = true;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCheckCard9() {
        System.out.println("checkCard");
        String card = "5218403274464132";
        boolean expResult = false;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCheckCard10() {
        System.out.println("checkCard");
        String card = "52184032744641322345656";
        boolean expResult = false;
        boolean result = Validator.checkCard(card);
        assertEquals(expResult, result);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
}
