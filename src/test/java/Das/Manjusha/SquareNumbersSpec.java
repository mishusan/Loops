package Das.Manjusha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manjushadas on 5/3/16.
 */
public class SquareNumbersSpec {
    @Test
    public void squareNumbersSpec(){
        SquareNumbers squareNumbers = new SquareNumbers();
        String expectedString = ("squares()" +
                "\n *** Output ***\n" +
                "1\n" +
                "4\n" +
                "9\n" +
                "16\n" +
                "25\n" +
                "36\n" +
                "49\n" +
                "64\n" +
                "81\n" +
                "100");
        String actualString = squareNumbers.squareNumbers();
        assertEquals(expectedString,actualString);
    }
}
