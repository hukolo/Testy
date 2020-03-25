package math;

import org.junit.Assert;
import org.junit.Test;

public class MathAverageTest {

    @Test
    public void testCalculateAverage(){
        int [] numbers = {1,2,3};

        float average = Math.calculateAverage(numbers);

        Assert.assertEquals(2.0,average,0.01);

    }
}
