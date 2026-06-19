import java.util.HashMap;
import java.util.Map;

public class subArrayWithXORK {
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        System.out.println(subArrayXOR(arr, 6));
        
    }
    //O(N*N)
    public static int subArrayXOR(int[]arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int xor=0;
            for(int j=i;j<arr.length;j++){
                xor^=arr[j];
                if(xor==k){
                    count++;
                }
            }
        }
        return count;
    }
     public int countSubarrays(int[] A, int k) {
        // Store frequency of prefix XORs
        Map<Integer, Integer> freq = new HashMap<>();
        // Initialize with prefix XOR 0
        freq.put(0, 1);

        // Current prefix XOR
        int prefixXor = 0;
        // Answer count
        int count = 0;

        // Traverse array
        for (int num : A) {
            // Update prefix XOR
            prefixXor ^= num;

            // Compute required XOR
            int target = prefixXor ^ k;

            // If target exists in map, add its frequency
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }

            // Store current prefix XOR in map
            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }
        return count;
    }
}
