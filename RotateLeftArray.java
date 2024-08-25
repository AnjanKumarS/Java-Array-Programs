import java.util.Arrays;

public class RotateLeftArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int k = 3;

        while(k>0)
        {
            int l = a[a.length - 1];
            for(int i=a.length-2;i>=0;i--)
            {
                a[i + 1] = a[i];
            }
            a[0] = l;
            k--;
        }
    
        System.out.println(Arrays.toString(a));
    }
}