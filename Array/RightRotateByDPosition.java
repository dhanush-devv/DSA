import java.util.Arrays;

public class RightRotateByDPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rightRotate(arr, 3);

        System.out.println(Arrays.toString(arr));
    }

    public static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}