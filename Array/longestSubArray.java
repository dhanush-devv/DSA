public class longestSubArray {
    public static void main(String[] args) {
        int arr[]={2,0,0,0,3};
        int k=3;
        System.out.println(findLongestSubArray(arr, k));
        System.out.println(longestSubArrayBetter(arr, k));
        System.out.println(longestSubArrayOptimized(arr, k));
    }
    //Brute force O(N*N*N)
    public static int findLongestSubArray(int[]arr,int sum){
        int len=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int s=0;
                for(int k=i;k<j;k++){
                    s+=arr[i];
                    if(s==k){
                        len=Math.max(len,j-i+1);
                    }
                }
            }
        }
        return len;
    }
    //Better O(N*N);
    public static int longestSubArrayBetter(int []arr,int sum){
        int len=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i;j<arr.length;j++){
                s+=arr[j];
                if(s==sum){
                    len=Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }

    //Optimized
    public static int longestSubArrayOptimized(int []arr,int s){
        int left=0,right=0,maxLen=0;
        int sum=arr[0];
        while (right<arr.length) {
            while (left<=right && sum > s) {
                sum-=arr[left];
                left++;
                
            }
            if(sum==s){
                maxLen=Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<arr.length){
                sum+=arr[right];
            }
            
        }
        return maxLen;
    }
    
}
