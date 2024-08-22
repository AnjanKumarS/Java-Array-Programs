import java.util.Arrays;
public class ZigZagElements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8,9};
        int[] arr = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while(k<arr.length)
        {
            if (i < a.length) {
                arr[k] = a[i];
                k++;
                i++;
            }
            if (j < b.length) {
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
