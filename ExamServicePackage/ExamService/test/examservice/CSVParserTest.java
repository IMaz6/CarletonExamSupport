/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examservice;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author domin_2o9sb4z
 */
public class CSVParserTest {
    
    public CSVParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of getEntry method, of class CSVParser.
     */
    @Test
    public void testGetEntry() {
        String testString = "a,b,c,d,e,3,f,0,1,2,3,4,5";
        Scanner lineScan = new Scanner(testString);
        CSVParser instance = new CSVParser(null);
        DataEntry expResult = new DataEntry("a", "b", "c", "d", "e", 3, "f", 0, 1, 2, 3, 4, 5);
        DataEntry result = instance.getEntry(lineScan);
        assertEquals(expResult, result);
    }
    
}
