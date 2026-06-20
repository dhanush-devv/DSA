import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverLappingIntervals {
    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        mergeOverLappingIntervals obj = new mergeOverLappingIntervals();

        List<List<Integer>> result = obj.merge(intervals);

        System.out.println(result);
        
    }
    public List<List<Integer>>merge(int[][]intervals){
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        int n=intervals.length;
        while(i<n){
            int start=intervals[i][0];
            int end=intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=end){
                end=Math.max(end,intervals[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start,end));
            i=j;
        }
        return ans;
        
    }
}
