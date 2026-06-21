public class countInversions {
    public static void main(String[] args) {
        int []arr={5,3,2,4,1};
        System.out.println(coutinversion(arr));
        
    }
    //Brute force
    public static int coutinversion(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
