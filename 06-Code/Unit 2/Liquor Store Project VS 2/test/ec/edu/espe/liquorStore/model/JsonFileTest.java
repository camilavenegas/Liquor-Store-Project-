/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.liquorStore.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Paredes
 */
public class JsonFileTest {
    
    public JsonFileTest() {
    }

    /**
     * Test of addToFile method, of class JsonFile.
     */
    @Test
    public void testAddToFile() {
        System.out.println("addToFile");
        Object object = null;
        JsonFile.addToFile(object);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of readObjects method, of class JsonFile.
     */
    @Test
    public void testReadObjects() {
        System.out.println("readObjects");
        String nameClass = "";
        ArrayList<Object> expResult = null;
        ArrayList<Object> result = JsonFile.readObjects(nameClass);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    
}
