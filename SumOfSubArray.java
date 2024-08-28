import java.util.Arrays;

public class SumOfSubArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int t = 12;
        int res[] = subArraySum(a, t);
        System.out.println(Arrays.toString(res));
    }

    public static int[] subArraySum(int[] a, int t) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if (sum == t)
                    return new int[] { i, j };
            }
        }
         return new int[] {-1,-1};
    }
}

