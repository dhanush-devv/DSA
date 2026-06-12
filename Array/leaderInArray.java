import java.util.ArrayList;
import java.util.Collections;

public class leaderInArray {
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
System.out.println(leader(arr));
        
    }
    public static ArrayList<Integer> leader(int[]arr){
        int max=Integer.MIN_VALUE;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
