package math;

import org.junit.Assert;
import org.junit.Test;

public class MathSumTest {

    @Test
    public void testSumTest(){
        int [] numbers = {1,2,3};

        int result = Math.calculateSum(numbers);

        Assert.assertEquals(6,result);
    }
}
