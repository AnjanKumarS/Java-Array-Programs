import java.util.Arrays;

public class MergeTwoArrayAlternatively {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};
        Arrays.sort(a);
        Arrays.sort(b);
        int[] arr = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            arr[k++] = a[i++];
            arr[k++] = b[j++];
        }
        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
