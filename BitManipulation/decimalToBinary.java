public class decimalToBinary {
    public static void main(String[] args) {
        System.out.println(convertToBinary(10));
    }
    public static String convertToBinary(int n){
        String res="";
        while(n!=0){
            int rem=n%2;
            res=rem+res;
            n/=2;
        }
        return res;
    }
}
