public class binaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryTODecimal(1011));
    }
    public static int binaryTODecimal(int n){
        int decimal=0;
        int power=1;
        while(n>0){
            int degit=n%10;
            decimal+=degit*power;
            power*=2;
            n/=10;
        }
        return decimal;
    }
}
