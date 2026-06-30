class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []result=new int[nums.length];
        result[0]=1;
    //   for(int i=0;i<nums.length;i++){
    //     int product=1;
    //     for(int j=0;j<nums.length;j++){
    //         if(i!=j){
    //             product*=nums[j];
    //         }
    //     }
    //     result[i] = product;
    //   } 
    //   return result; 
    for(int i=1;i<nums.length;i++){
        result[i]=result[i-1]*nums[i-1];
    }
    int rightProduct=1;
    for(int i=nums.length-1;i>=0;i--){
        result[i]*=rightProduct;
        rightProduct*=nums[i];
    }
    return result;
    }
}