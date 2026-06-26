public class peakElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,8};
        System.out.println(findPeakElement(arr));
        
    }
    public static int findPeakElement(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if((i==0 || arr[i]>arr[i-1])&&(i==arr.length-1 || arr[i]>arr[i+1])){
                return i;
            }
        }
        return -1;
    }
    public static int findPeakElementOptimized(int[]arr){
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low=1,high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;

    }
}
