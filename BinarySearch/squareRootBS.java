public class squareRootBS {
    public static void main(String[] args) {
        int n=28;
        System.out.println(findSquareRoot(n));
    }
    public static int findSquareRoot(int n){
        int ans=-1;
        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;
                
            }else{
                break;
            }
        }
        return ans;
    }
}
