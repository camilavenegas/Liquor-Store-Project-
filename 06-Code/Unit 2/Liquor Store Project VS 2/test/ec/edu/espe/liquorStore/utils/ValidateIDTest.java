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
public class ValidateIDTest {
    
    public ValidateIDTest() {
    }

    /**
     * Test of validateCI method, of class ValidateID.
     */
    @Test
    public void testValidateCI() {
        System.out.println("validateCI");
        String CI = "";
        boolean expResult = false;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
        
    }
    
    @Test
    public void testValidateCI1() {
        System.out.println("validateCI");
        String CI = "1723163687";
        boolean expResult = true;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testValidateCI2() {
        System.out.println("validateCI");
        String CI = "1752061828";
        boolean expResult = true;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testValidateCI3() {
        System.out.println("validateCI");
        String CI = "0504157892";
        boolean expResult = true;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testValidateCI4() {
        System.out.println("validateCI");
        String CI = "1723163689";
        boolean expResult = false;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testValidateCI5() {
        System.out.println("validateCI");
        String CI = "1712040284";
        boolean expResult = true;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testValidateCI6() {
        System.out.println("validateCI");
        String CI = "1709135790";
        boolean expResult = true;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testValidateCI7() {
        System.out.println("validateCI");
        String CI = "1709135735";
        boolean expResult = false;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testValidateCI8() {
        System.out.println("validateCI");
        String CI = "1712345303";
        boolean expResult = true;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testValidateCI9() {
        System.out.println("validateCI");
        String CI = "1802209021";
        boolean expResult = true;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testValidateCI10() {
        System.out.println("validateCI");
        String CI = "1802209024";
        boolean expResult = false;
        boolean result = ValidateID.validateCI(CI);
        assertEquals(expResult, result);
       
    }
    
    
    
    
    
    
    
    
    
}
