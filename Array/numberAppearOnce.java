import java.util.HashMap;

public class numberAppearOnce {
    public static void main(String[] args) {
        int [] arr={1,1,0,2,1};
        //System.out.println(numberOne(arr));
        System.out.println(numberOneOptimized(arr));
        
    }
    public static int numberOne(int []arr){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1){
                return num;
            }
        }
        return -1;
    }
    public static int numberOneOptimized(int []arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}
