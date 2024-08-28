import java.util.Arrays;

public class SegrateEvenANDOddNumbers {
    public static void main(String[] args) {
        int a[] = { 1, 5, 6, 8, 10, 15, 13, 12 };
        int res[] = new int[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0)
            {
                res[k] = a[i];
                k++;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                res[k] = a[i];
                k++;
            }
        }
        
        System.out.println(Arrays.toString(res));
    }
}
