package Das.Manjusha;
import java.lang.Math;
import java.util.Scanner;

/**
 * Created by manjushadas on 5/3/16.
 */
public class PowersOfTwo {

        public String x;
        Scanner scanner = new Scanner(System.in);
        int n;
        int j;
        public String powersOfTwo(){
            n=scanner.nextInt();
            x="powers("+n+")"+"\n *** Output ***";
            for (int i = 1; i < n+1; i++) {
                j = (int) Math.pow(2,i);
                x+="\n"+j;
            }
            return x;
        }
}
