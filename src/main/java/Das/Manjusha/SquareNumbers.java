package Das.Manjusha;

/**
 * Created by manjushadas on 5/3/16.
 */
public class SquareNumbers {
    public String x;
    public String squareNumbers() {
        int j;
        x="squares()"+"\n *** Output ***";
            for (int i = 1; i < 11; i++) {
                j = i*i;
                x += "\n" + j;
            }

        return x;
    }
}
