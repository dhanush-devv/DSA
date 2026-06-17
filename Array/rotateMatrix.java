import java.util.Arrays;

public class rotateMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        RotateMatrix(arr);
        

    }
    public static void RotateMatrix(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][n-1-i]=arr[i][j];
            }
        }
         for (int[] row : ans) {
        System.out.println(Arrays.toString(row));
    }
    }
    public static void RotateMatrixOptimal(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
         for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
