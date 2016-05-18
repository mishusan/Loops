package Das.Manjusha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manjushadas on 5/3/16.
 */
public class RandomNumbersSpec {
    @Test
    public void randomNumbersSpec(){
        RandomNumbers randomNumbers = new RandomNumbers();
        String expectedString = ("random4()" +
                "\n *** Output ***\n" +
                "4\n" +
                "5\n" +
                "59\n" +
                "19");
        String actualString = randomNumbers.randomNumbers();
        assertEquals(expectedString,actualString);
    }
}
