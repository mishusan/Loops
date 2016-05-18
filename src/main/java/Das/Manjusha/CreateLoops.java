package Das.Manjusha;

/**
 * Created by manjushadas on 5/3/16.
 */
public class CreateLoops {
    public String x;
    public String createLoop() {
        x="oneToTen()"+"\n *** Output ***";
        for (int i = 1; i < 11; i++) {
            x+="\n"+i;
        }
        return x;
    }
}