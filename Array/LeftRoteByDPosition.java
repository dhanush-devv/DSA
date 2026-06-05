import java.util.Arrays;

public class LeftRoteByDPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        leftRotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        
    }
    //Brute force
    public static int[] leftRotate(int []arr,int d){
        d=d%arr.length;
        int [] temp=new int[d];
        //Copy to temp
         for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        //shift
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        //append
        int j=0;
        for(int i=arr.length-d;i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }
        return arr;
    }

    //optimal approach
    public static void leftrotate(int[]arr,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n);

    }
    public static void reverse(int [] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
