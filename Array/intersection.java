import java.util.ArrayList;
import java.util.Arrays;

public class intersection {
    public static void main(String[] args) {
         int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 6};
      System.out.println(inter(arr1, arr2));
        
    }
    public static ArrayList<Integer> inter(int[]arr1,int[]arr2){
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0,j=0;
       while (i<arr1.length && j<arr2.length) {
        if(arr1[i]<arr2[j]){
            i++;
        }
        else if(arr1[i]>arr2[j]){
            j++;
        }else{
            ans.add(arr1[i]);
            i++;
            j++;
        }
        
    }
    return ans;
    }
}
