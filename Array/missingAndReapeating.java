import java.util.Arrays;

public class missingAndReapeating {
    public static void main(String[] args) {
        int []arr={1,1,2,3,4,6};

        //findReaptingAndMissingNumber(arr, arr.length);
        // System.out.println(Arrays.toString(findMissingRepeatingNumbers(arr)));
        System.err.println(Arrays.toString(findMissingRepeatingNumbersOptimal(arr)));

    }
    public static void findReaptingAndMissingNumber(int[]arr,int n){
        int repeating=-1,missing=-1;
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    count++;
                }
            }
            if(count==2){
                    repeating=i;
                }
                if(count==0){
                    missing=i;
                }
                if(repeating!=-1 && missing!=-1){
                    break;
                }
        }
         System.out.println("Repeating Number: " + repeating);
        System.out.println("Missing Number: " + missing);
    }
    public static int[] findMissingRepeatingNumbers(int[]arr){
        int n=arr.length;
        int[]hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        int repeating=-1,missing=-1;
        for(int i=1;i<=n;i++){
            if(hash[i]==2){
                repeating=i;
            }else if(hash[i]==0){
                missing=i;
            }
            if(repeating!=-1 && missing!=-1) break;
        }
        return new int[]{repeating,missing};
    }
    public static  int[] findMissingRepeatingNumbersOptimal(int []arr){
        int n=arr.length;
        //s-sN //x-y
        //S2-S2N
        long s=0,s2=0;
        long sN=(n*(n+1))/2;
        long s2N=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++){
            s+=arr[i];
            s2+=(long)arr[i]*(long)arr[i];
        }
        long val1=s-sN; //x-y
        long val2=s2-s2N;
        val2=val2/val1;//x+y
        long x=(val1+val2)/2;
        long y=x-val1;
        return new int[]{(int)x,(int)y};
        
    } 
}
