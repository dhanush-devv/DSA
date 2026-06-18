import java.util.HashMap;

public class countSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k)); // 2
        
    }
    public static int subarraySum(int[]arr,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        int preSum=0,count=0;
        for(int num:arr){
            preSum+=num;
            if(map.containsKey(preSum-k)){
                count+=map.get(preSum-k);
            }
             map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
