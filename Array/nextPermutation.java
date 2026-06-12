import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int arr[]={2,1,5,4,3,0,0};
        nextPer(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    public static void nextPer(int[]arr){
        int index=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr, 0, arr.length - 1);
            return;
        }
        for(int i=arr.length-1;i>=index;i--){
            if(arr[i]>arr[index]){
               swap(arr, i, index);
                break;
            }
        }
        reverse(arr,index+1,arr.length-1);
        
    }
    public static void reverse(int []arr,int start,int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int []arr,int start,int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            
        
    }
    
}
