import java.util.ArrayList;
import java.util.HashSet;

public class unionArray {
    public static void main(String[] args) {
          int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        // int[] result = union(arr1, arr2);

        // for (int num : result) {
        //     System.out.print(num + " ");
        // }\
        ArrayList<Integer> result = unionOptimized(arr1, arr2);

        System.out.println(result);
    }
    public static int[] union(int[]arr1,int []arr2){
        HashSet<Integer>ans=new HashSet<>();
        for(int i:arr1){
            ans.add(i);
        }
        for(int i:arr2){
            ans.add(i);
        }
        int union[]=new int[ans.size()];
       int j=0;
        for(int num:ans){
            union[j++]=num;
        }
        return union;
        
    }

    public static ArrayList<Integer> unionOptimized(int[]arr1,int[]arr2){
        int i=0,j=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]<=arr2[j]){
                if(ans.isEmpty()|| ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else if (arr1[i] > arr2[j]){
                if(ans.isEmpty()|| ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
             else { // arr1[i] == arr2[j]
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr1[i]) {
                ans.add(arr1[i]);
            }
            i++;
            j++;
        }
            
        }
        while (j<arr2.length) {
            if(ans.isEmpty()|| ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
        }
        while (i<arr1.length) {
            if(ans.isEmpty()|| ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
        }
        return ans;
    }
}
