public class findFirstAndLatOccurence {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,1,2,3,4,5,6};
        System.out.println(firstOcurence(arr, 1));
        System.out.println(lastOcurence(arr, 1));
        
    }
    public static int firstOcurence(int arr[],int k){
        int low=0,high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                first=mid;
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
     public static int lastOcurence(int arr[],int k){
        int low=0,high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }
}
