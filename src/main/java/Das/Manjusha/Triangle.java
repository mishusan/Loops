package Das.Manjusha;

/**
 * Created by manjushadas on 5/3/16.
 */
public class Triangle {
    String x;
    String y = "*";

    public String triangle(){
        x="triangle()"+"\n *** Output ***";
        for (int i=1; i<6;i++){
            x+= "\n";
            for(int j=0;j<i; j++){
                x += y;
            }
        }
        return x;
    }
}
