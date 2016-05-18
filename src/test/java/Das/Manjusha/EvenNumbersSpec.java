package Das.Manjusha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manjushadas on 5/3/16.
 */
public class EvenNumbersSpec {
    @Test
    public void evenNumbersSpec(){
        EvenNumbers evenNumbers = new EvenNumbers();
        String expectedString = ("even(20)" +
                "\n *** Output ***\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "8");
        String actualString = evenNumbers.evenNumbers();
        assertEquals(expectedString,actualString);
    }





}
