package Das.Manjusha;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by manjushadas on 5/3/16.
 */
public class TriangleSpec {
    @Test
            public void triangelSpec() {
        Triangle triangle = new Triangle();
        String expectedString = ("triangle()" +
                "\n *** Output ***\n" +
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****");
        String actualString = triangle.triangle();
        assertEquals(expectedString, actualString);
    }
}
