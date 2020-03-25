package math;

import org.junit.Assert;
import org.junit.Test;

public class MathMultiplicationArrayNumber {

    @Test
    public void testMultiplicationArrayNumber(){
        int [] numbers = {1,2,3};

        int multiplicationArray = Math.multiplicationArrayNumber(numbers);

        Assert.assertEquals(6,multiplicationArray);
    }
}
