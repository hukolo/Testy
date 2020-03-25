package math;

import org.junit.Assert;
import org.junit.Test;

public class MathFactorialTest {

    @Test
    public void testCalculateFactorial(){
        long number = 3;

        long factorial = Math.calculateFactorial(number);

        Assert.assertEquals(6,factorial);
    }

   /* @Test
    public void testCalculateFactorial2(){
        long number = 10;

        long factorial = Math.calculateFactorial(number);

        Assert.assertEquals(362300,factorial);
    }
*/
}
