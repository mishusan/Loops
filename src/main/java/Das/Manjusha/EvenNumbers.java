package Das.Manjusha;

import java.util.Scanner;

/**
 * Created by manjushadas on 5/3/16.
 */
public class EvenNumbers {
    public String x;
    int n;
    Scanner scanner = new Scanner(System.in);
    public String evenNumbers() {
        n = scanner.nextInt();
        x="even(20)"+"\n *** Output ***";
        for (int i = 2; i < n; i+=2) {
            x+="\n"+i;
        }
        return x;

    }
}
