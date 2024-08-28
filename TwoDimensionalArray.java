import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6, 6 }, { 7, 8, 9, 9 } };

        System.out.println(Arrays.deepToString(a));

        for (int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
