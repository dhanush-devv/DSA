

public class reversePairs {
    public static void main(String[] args) {
        int arr[]={40,25,19,12,9,6,2};
        System.out.println(reverpairs(arr));
        
    }
    public static int reverpairs(int[]arr){
       
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>2*arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    //optimal-> Merge sort
}
