package Das.Manjusha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manjushadas on 5/3/16.
 */
public class PowersOfTwoSpec {
    @Test
    public void powersOfTwoSpec() {
        PowersOfTwo powersOfTwo = new PowersOfTwo();
        String expectedString = ("powers(8)" +
                "\n *** Output ***\n" +
                "2\n" +
                "4\n" +
                "8\n" +
                "16\n" +
                "32\n" +
                "64\n" +
                "128\n" +
                "256");
        String actualString = powersOfTwo.powersOfTwo();
        assertEquals(expectedString, actualString);
    }

}
