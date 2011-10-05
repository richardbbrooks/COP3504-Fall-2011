/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import changemaker.ChangeMaker;

/**
 *
 * @author jennawheeler
 */
public class ChangeMakerTest {

    public ChangeMakerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculateTwenties(){
        System.out.println("Test calculateTwenties");
        
        ChangeMaker test1 = new ChangeMaker(15.00);
        ChangeMaker test2 = new ChangeMaker(36.00);
        ChangeMaker test3 = new ChangeMaker(47.00);
        ChangeMaker test4 = new ChangeMaker(75.00);
        ChangeMaker test5 = new ChangeMaker(83.00);
        ChangeMaker test6 = new ChangeMaker(99.00);
        
        assertEquals((int) 0, test1.getTwenties());
        assertEquals((int) 1, test2.getTwenties());
        assertEquals((int) 2, test3.getTwenties());
        assertEquals((int) 3, test4.getTwenties());
        assertEquals((int) 4, test5.getTwenties());
        assertEquals((int) 4, test6.getTwenties());
        

        
    }
@Test
    public void testCalculateTens(){
        System.out.println("Test calculateTens");
        
        ChangeMaker test1 = new ChangeMaker(3.00);
        ChangeMaker test2 = new ChangeMaker(7.00);
        ChangeMaker test3 = new ChangeMaker(15.00);
        ChangeMaker test4 = new ChangeMaker(19.00);
        
        assertEquals((int) 0, test1.getTens());
        assertEquals((int) 0, test2.getTens());
        assertEquals((int) 1, test3.getTens());
        assertEquals((int) 1, test4.getTens());
        
    }

@Test
    public void testCalculateFives(){
        System.out.println("Test calculateFives");
        
        ChangeMaker test1 = new ChangeMaker(3.00);
        ChangeMaker test2 = new ChangeMaker(5.00);
        ChangeMaker test3 = new ChangeMaker(9.00);
        
        assertEquals((int) 0, test1.getFives());
        assertEquals((int) 1, test2.getFives());
        assertEquals((int) 1, test3.getFives());

        
    }

@Test
    public void testCalculateOnes(){
        System.out.println("Test calculateOnes");
        
        ChangeMaker test1 = new ChangeMaker(1.00);
        ChangeMaker test2 = new ChangeMaker(2.00);
        ChangeMaker test3 = new ChangeMaker(4.00);
        
        assertEquals((int) 1, test1.getOnes());
        assertEquals((int) 2, test2.getOnes());
        assertEquals((int) 4, test3.getOnes());
        
    }

@Test
    public void testToString(){
        System.out.println("Test toString");

        ChangeMaker test1 = new ChangeMaker(99.00);
        ChangeMaker test2 = new ChangeMaker(83.00);
        ChangeMaker test3 = new ChangeMaker(75.00);
        ChangeMaker test4 = new ChangeMaker(47.00);
        ChangeMaker test5 = new ChangeMaker(36.00);
        ChangeMaker test6 = new ChangeMaker(15.00);
	ChangeMaker test7 = new ChangeMaker(3.00);


        assertEquals((String) "4 twenties, 1 ten, 1 five, 4 ones", test1.toString());
        assertEquals((String) "4 twenties, 0 tens, 0 fives, 3 ones", test2.toString());
        assertEquals((String) "3 twenties, 1 ten, 1 five, 0 ones", test3.toString());
        assertEquals((String) "2 twenties, 0 tens, 1 five, 2 ones", test4.toString());
        assertEquals((String) "1 twenty, 1 ten, 1 five, 1 one", test5.toString());
        assertEquals((String) "0 twenties, 1 ten, 1 five, 0 ones", test6.toString());
	assertEquals((String) "0 twenties, 0 tens, 0 fives, 3 ones", test7.toString());


    }



    

}
