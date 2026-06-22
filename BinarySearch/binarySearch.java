public class binarySearch{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        //System.out.println(bs(arr, 2));
        System.out.println(bsRecursion(arr, 0, arr.length-1, 7));
        
    }
    public static int bs(int []arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    //Using recursion
    public static int bsRecursion(int[]arr,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target){
          return  bsRecursion(arr, low, mid-1, target);
        }else{
           return bsRecursion(arr, mid+1, high, target);
        }
    }
}