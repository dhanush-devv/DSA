import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
         ThreeSum obj = new ThreeSum();

        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.println(obj.threesum(arr));
        
    }
   public List<List<Integer>> findThreeSum(int[]arr){
         HashSet<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            HashSet<Integer>hashset=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int third=-(arr[i]+arr[j]);
                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                 hashset.add(arr[j]);
            }

        }
         return new ArrayList<>(ans);
    }

    //Optimal
    public List<List<Integer>>threesum(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer>temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k-1]) k--;
                }
            }
        }
        return ans;

    }
}
