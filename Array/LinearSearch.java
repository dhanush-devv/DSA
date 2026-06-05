public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,3,4,5,6};
        System.out.println(linearsearch(arr, 1));
        
    }
    public static int linearsearch(int[]arr,int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
