package Das.Manjusha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manjushadas on 5/3/16.
 */
public class OddNumbersSpec {
    @Test
    public void oddNumbersSpec(){
        OddNumbers oddNumbers = new OddNumbers();
        String expectedString = ("oddNumbers()" +
                "\n *** Output ***\n" +
                "1\n" +
                "3\n" +
                "5\n" +
                "7\n" +
                "9\n" +
                "11\n" +
                "13\n" +
                "15\n" +
                "17\n" +
                "19");
        String actualString = oddNumbers.oddNumbers();
        assertEquals(expectedString,actualString);
    }
}
