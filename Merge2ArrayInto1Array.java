import java.util.Arrays;

public class Merge2ArrayInto1Array {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 6, 7, 8, 9, 10 };
        int res [] = new int[a.length+b.length];
        int j = 0;
        for(int i=0;i<res.length;i++)
        {
            if (i < a.length)
                res[i] = a[i];
            else
                res[i] = b[j++];
        }
        System.out.println(Arrays.toString(res));
    }
}
