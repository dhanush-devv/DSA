public class maximumProductSubArray {
    
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
       // System.out.println(maxProduct(arr));
         System.out.println(maxiProduct(arr));
        
    }
    //Better
    public static int maxProduct(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=i;j<arr.length;j++){
                product*=arr[j];
                max=Math.max(max, product);
            }
        }
        return max;
    }
    //Optimal
    public static int maxiProduct(int[]arr){
        int prefix=1,suffix=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=arr[i];
            suffix*=arr[arr.length-i-1];
            ans=Math.max(ans, Math.max(prefix, suffix));
        }
        return ans;
    }
}
