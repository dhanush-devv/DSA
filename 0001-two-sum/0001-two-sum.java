class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(ans.containsKey(complement)){
                return new int[]{ans.get(complement),i};
            }
            ans.put(nums[i],i);
        }
        return new int[]{};
        // Arrays.sort(nums);
        // int left=0;
        // int right=nums.length-1;
        // while(left<=right){
        //     int sum=nums[left]+nums[right];
        //     if(sum==target){
        //         return new int[]{left,right};
        //     }else if(sum<target){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return new int[]{};
    }
}