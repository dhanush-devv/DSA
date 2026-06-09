import java.util.Arrays;
import java.util.HashMap;

public class twoSum{
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        System.out.println(Arrays.toString(twoSumSolution(arr, 14)));
        
    }
    public static int[] twoSumSolution(int[]arr,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}