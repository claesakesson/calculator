package ecutb.claes.akesson;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    /**
     * Rigorous Test :-)
     */
 @Test

    public void test_calculations_addition() {

     double testnr1 = 1;
     double testnr2 = 1;
     double expected = 2;

     double actual = App.addition(testnr1, testnr2);

     Assert.assertEquals(expected, actual, 0);
 }


     @Test
   public void test_calculations_substraction(){

     double testnr1 = 1;
     double testnr2 = 1;
     double expected = 0;

     double actual = App.subtraction(testnr1,testnr2);

     Assert.assertEquals(expected,actual, 0);


 }
 @Test
    public void test_calculations_multiplications(){

     double testnr1 = 1;
     double testnr2 = 1;
     double expected = 1;

     double actual = App.multiplication(testnr1,testnr2);

     Assert.assertEquals(expected,actual, 0);
 }
 @Test
    public void test_calculations_division(){
     double testnr1 = 1;
     double testnr2 = 1;
     double expected = 1;

     double actual = App.division(testnr1,testnr2);

     Assert.assertEquals(expected,actual,0);
 }
}
