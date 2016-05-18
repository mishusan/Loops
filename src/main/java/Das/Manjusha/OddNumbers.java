package Das.Manjusha;

/**
 * Created by manjushadas on 5/3/16.
 */
public class OddNumbers {
    public String x;
    public String oddNumbers() {
        x="oddNumbers()"+"\n *** Output ***";
        for (int i = 1; i < 20; i+=2) {
            x+="\n"+i;
        }
        return x;
    }
}
