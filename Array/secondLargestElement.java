import java.util.Arrays;

public class secondLargestElement{
    public static void main(String[]args){
        int [] arr={1,4,1,5,6,6,8,7};
        System.out.println(secondLargest(arr));

    }
    public static int secondLargest(int []arr){
        //Brute force
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                largest=arr[i];
                break;
            }
        }
        return largest;
    }
}