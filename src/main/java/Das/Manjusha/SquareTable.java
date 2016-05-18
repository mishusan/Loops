package Das.Manjusha;

/**
 * Created by manjushadas on 5/3/16.
 */
public class SquareTable {

    public String squareTable(int n) {
        String x;
        String y;
        String table = "";
        x = "random4()" + "\n *** Output ***" + "\nA 4 x 4 table square\n";
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (i + 1) * (j + 1);
                table +=array[i][j]+" ";

                }
            table+="\n";
            }

        return x+=table;
        }




    public static void main(String[] args) {
        SquareTable table = new SquareTable();
        String result = table.squareTable(4);
        System.out.println(result);
    }


}
