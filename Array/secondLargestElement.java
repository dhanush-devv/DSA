import java.util.Arrays;

public class secondLargestElement{
    public static void main(String[]args){
        int [] arr={1,4,1,5,6,6,8,7};
        //System.out.println(secondLargest(arr));
        //System.out.println(secondLargestBetter(arr));
        System.out.println(secondLargestOptimal(arr));

    }
    public static int secondLargest(int []arr){
        //Brute force
        //Time Complexity->O(nlogn+n)
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
    public static int secondLargestBetter(int []arr){
        //O(N+N)
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
//O(N)
    public static int secondLargestOptimal(int []arr){
        int largest=arr[0],secondLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}