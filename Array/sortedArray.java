public class sortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1};
        System.out.println(isArraySorted(arr));
        
    }
    // public static boolean isArraySorted(int []arr){
    //     boolean sorted=true;
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]>=arr[i+1]) sorted=false;
    //         else sorted=true;
    //     }
    //     return sorted;
    // }
    public static boolean isArraySorted(int []arr){
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]) {
                return true;
            }
        }
        return false;
    }


}
