import java.util.Arrays;
import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
         int[] arr = {2, 2, 1, 1, 2, 2, 2};
        //   int result = majorityElementOne(arr);

        // if (result != -1) {
        //     System.out.println("Majority Element: " + result);
        // } else {
        //     System.out.println("No Majority Element");
        // }
        System.out.println(majorityElementOptimized(arr));
    }

    public static int majorityElementOne(int[]arr){
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int num:arr){
            ans.put(num, ans.getOrDefault(num, 0)+1);
            if(ans.get(num)>arr.length/2){
                return num;
            }
        }
        return -1;

    }
    //
    public static int majorityElementOptimized(int[]arr){
        int count=0;
        int ele=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }else if(arr[i]==ele) count++;
            else count--;
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele) count1++;
            if(count1>arr.length/2) return arr[i];
        }
        return -1;

    }
}
