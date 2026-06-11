import java.util.ArrayList;
import java.util.Arrays;

public class rearrangeArrayElementBySign {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        //System.out.println(Arrays.toString(rearrangeArray(arr)));
        System.out.println(Arrays.toString(rearrangeArrayOptimized(arr)));
        
    }
    //Brute force
    public static int[] rearrangeArray(int[]arr){
        ArrayList<Integer>possitive=new ArrayList<>();
        ArrayList<Integer>negative=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                possitive.add(arr[i]);
            }else{
                negative.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length/2;i++){
            arr[2*i]=possitive.get(i);
            arr[2*i+1]=negative.get(i);
        }
        return arr;
    }
    //Optimized
    public static int[] rearrangeArrayOptimized(int[]arr){
        int ans[]=new int[arr.length];
        int possitive=0,negative=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[negative]=arr[i];
                negative+=2;
            }else{
                ans[possitive]=arr[i];
                possitive+=2;
            }
        }
        return ans;
    }
}
