import java.util.ArrayList;
import java.util.HashMap;

public class majorityElementTwo {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 3, 3 };
        System.out.println(majorityElement(arr));

    }

    // Brute force
    public static ArrayList<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (ans.size() == 0 || ans.get(0) != arr[i]) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                if (count > arr.length / 3) {
                    ans.add(arr[i]);
                }
            }
            if (ans.size() == 2) {
                break;
            }

        }
        return ans;
    }

    // Better
    public static ArrayList<Integer> majorityEleTwo(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int mini = nums.length / 3 + 1;
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            if (mpp.get(nums[i]) == mini) {
                ans.add(nums[i]);
            }

            if (ans.size() == 2)
                break;
        }

        return ans;
    }
    public static ArrayList<Integer> majorityele(int[]arr){
        int count1=0,count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(count1==0 && arr[i]!=ele2){
                count1=1;
                ele1=arr[i];
            }else if(count2==0 && arr[i]!=ele1){
                count2=1;
                ele2=arr[i];
            }else if(count1==ele1) count1++;
            else if(count2==ele2) count2++;
            else{
                count1--;
                count2--;
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        count1=0;
        count2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele1) count1++;
            if(arr[i]==ele2) count2++;
        }
        int min=(int)((arr.length)/3)+1;
        if(count1>=min) ans.add(ele1);
        if(count2>min) ans.add(ele2);
        return ans;
    }
}
