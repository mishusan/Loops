package Das.Manjusha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manjushadas on 5/3/16.
 */
public class CreatLoopsSpec {

    @Test
    public void createLooopsSpec(){
        CreateLoops createLoops=new CreateLoops();
        String expectedString = ("oneToTen()" +
                "\n *** Output ***\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10");
        String actualString = createLoops.createLoop();
        assertEquals(expectedString,actualString);
    }




}
