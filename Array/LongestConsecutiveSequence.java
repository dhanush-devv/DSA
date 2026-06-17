import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,1,1,1,3};
        System.out.println(longestSequence(arr));
        
    }
    public static int longestSequence(int[]arr){
        Arrays.sort(arr);
        int longest=1,count=0,lastSmallest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastSmallest){
                count+=1;
                lastSmallest=arr[i];
            }else if(arr[i]!=lastSmallest){
                count=1;
                lastSmallest=arr[i];
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }
}
