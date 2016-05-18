package Das.Manjusha;

import java.util.Scanner;

/**
 * Created by manjushadas on 5/3/16.
 */
public class AreWeThereYet {
    String x;


    public void areWeThereYet(){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Are we there yet?");
            x = scanner.nextLine();
        }
        while (!x.equals("Yes"));

        }
    }


