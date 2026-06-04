import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        System.out.println(Arrays.toString(removeduplicate(arr)));
        System.out.println(remove(arr));

    }
    public static int[] removeduplicate(int[]arr){
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        int result[]=new int[ans.size()];
        int index=0;
        for (int it : ans) {
           result[index]=it;
           index++; 
        }
        return result;
    }
    //to pointer
    public static int remove(int []arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;//size
    }
}
