/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Paredes
 */
public class PasswordTest {
    
    public void PasswordTest() {

    }

    /**
     * Test of Encrypt method, of class Password.
     */
    @Test
    public void testEncrypt() {
        System.out.println("Encrypt");
        String password = "";
        Password instance = new Password();
        String expResult = "";
        String result = instance.Encrypt(password);
        assertEquals(expResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Decrypt method, of class Password.
     */
    @Test
    public void testDecrypt() {
        System.out.println("Decrypt");
        String PswC = "";
        Password instance = new Password();
        String expResult = "";
        String result = instance.Decrypt(PswC);
        assertEquals(expResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
