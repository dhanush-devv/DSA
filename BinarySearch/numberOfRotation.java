public class numberOfRotation {
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(findNumberOfRotation(arr));
    }
    public static int findNumberOfRotation(int[]arr){
        int low=0,high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }
                low=mid+1;
            }else{
                high=mid-1;
                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];
                }
            }
        }return index;
    }
}
