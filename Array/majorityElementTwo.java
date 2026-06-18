import java.util.ArrayList;

public class majorityElementTwo {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,3};
        System.out.println(majorityElement(arr));
        
    }
    public static ArrayList<Integer> majorityElement(int[]arr){
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(ans.size()==0 || ans.get(0)!=arr[i]){
                int count=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==arr[i]){
                        count++;
                    }
                }
                if(count>arr.length/3){
                    ans.add(arr[i]);
                }
            }
            if(ans.size()==2){
                break;
            }
            
        }
        return ans;
    }
}
