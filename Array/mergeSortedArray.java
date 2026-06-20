import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        mergeBetter(arr1, arr2);
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        
    }
    public static void merge(int []arr1,int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int []arr3=new int[m+n];
        int left=0;
        int right=0;
        int index=0;
        while(left<n && right<m){
            if(arr1[left]<arr2[right]){
                arr3[index++]=arr1[left++];
            }else{
                arr3[index++]=arr2[right++];
            }
        }
        while(left<n){
            arr3[index++]=arr1[left++];
        }
        while(right<m){
            arr3[index++]=arr2[right++];
        }
        for(int i=0;i<n+m;i++){
            if(i<n) arr1[i]=arr3[i];
            else arr2[i-n]=arr3[i];
        }
    }

    public static void mergeBetter(int []arr1,int []arr2){
        int n=arr1.length;
        int m=arr2.length;
        int left=n-1;
        int right=0;
        while(left>=0 && right<=m){
            if(arr1[left]>arr2[right]){
                swap(arr1,left,arr2,right);
                left--;right++;
            }else{
                break;
            }
        }
         Arrays.sort(arr1);
    Arrays.sort(arr2);
    } 
    public static void swap(int []arr1,int left,int arr2[],int right){
        int temp=arr1[left];
        arr1[left]=arr2[right];
        arr2[right]=temp;
    }
}
