import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
         System.out.println(generate(5));
        
    }
    public static ArrayList<Integer>generateRow(int row){
        long ans=1;
        ArrayList<Integer>ansRow=new ArrayList<>();
        ansRow.add(1);
        for(int col=1;col<=row;col++){
            ans=ans*(row-col+1);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
     public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            triangle.add(generateRow(row));
        }

        return triangle;
    }
}
