public class setMatrixZeros {
    public static void main(String[] args) {
          int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        set(arr);

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
    }
    //Brute force
    public static void setMatrix(int [][]arr,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    markRow(arr,i, n, m);
                    markColumn(arr, j,n, m);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void markRow(int[][]arr,int i,int n,int m){
        for(int j=0;j<m;j++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
     public static void markColumn(int[][]arr,int j,int n,int m){

        for(int i=0;i<m;i++){
            if(arr[i][j]!=0){
                arr[i][j]=-1;
            }
        }
    }
    public static void set(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;

        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
     
    
}
