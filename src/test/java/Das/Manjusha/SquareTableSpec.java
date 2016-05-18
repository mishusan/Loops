package Das.Manjusha;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by manjushadas on 5/3/16.
 */
public class SquareTableSpec {
    @Test
            public void squareTableSpec() {
        SquareTable squareTable = new SquareTable();
        String expectedString = "random4()" + "\n *** Output ***" + "\nA 4 x 4 table square\n" +
                "1 2 3 4 5 6 \n" +
                "2 4 6 8 10 12 \n" +
                "3 6 9 12 15 18 \n" +
                "4 8 12 16 20 24 \n" +
                "5 10 15 20 25 30 \n" +
                "6 12 18 24 30 36 \n";
        String actualString = squareTable.squareTable(6);
        assertEquals(expectedString, actualString);
    }
}
