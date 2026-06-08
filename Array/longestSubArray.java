public class longestSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(findLongestSubArray(arr, k));
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
    
}
