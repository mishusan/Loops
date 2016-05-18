package Das.Manjusha;


import java.util.Random;

/**
 * Created by manjushadas on 5/3/16.
 */
public class RandomNumbers {
    public String x;
    Random random = new Random();
    int j;
    public String randomNumbers() {

        x="random4()"+"\n *** Output ***";
        for (int i = 1; i < 5; i++) {
            j = random.nextInt(10);
            x+="\n"+j;
        }
        System.out.println(x);
        return x;
    }
}
