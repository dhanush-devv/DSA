import java.util.Arrays;

public class moveAllZerosToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,5};
        //System.out.println(Arrays.toString(moveZero(arr)));
        System.out.println(Arrays.toString(moveZeroOptimized(arr)));
        
    }
    public static int[] moveZero(int []arr){
        int [] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
        for(int i=temp.length;i<arr.length;i++){
            arr[i]=0;
        }
        return arr;
    }
    public static int[] moveZeroOptimized(int []arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;

    }
}
