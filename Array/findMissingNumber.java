public class findMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        //System.out.println(findMissNumber(arr, 5));
        System.out.println(findMissNumberOptimized(arr, 5));
        
    }
    public static int findMissNumber(int []arr,int n){
        for(int i=1;i<=n;i++){
            int flag=0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }

    public static int findMissNumberOptimized(int[]arr,int n){
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=arr[i];
        }
        return (sum-sum2);
    }
}
