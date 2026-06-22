public class lowerBoundInBS {
    public static void main(String[] args) {

        int arr[]={3,5,8,15,15,16};
        //System.out.println(lowerBound(arr, 15));
        System.out.println(UpperBound(arr,5));
    }
    public static int lowerBound(int[]arr,int target){
        int ans=arr.length;
        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int UpperBound(int[]arr,int target){
        int ans=arr.length;
        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

}
