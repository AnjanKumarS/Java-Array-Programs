import java.util.Arrays;

public class RotateRightArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        while(k>0)
        {
            int f = a[0];
            for(int i=0;i<a.length-1;i++)
            {
                a[i] = a[i + 1];
            }
            a[a.length-1] = f;
            k--;
        }
        System.out.println(Arrays.toString(a));
    }
}
