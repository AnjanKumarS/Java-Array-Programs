public class SecondMinEleInArray {
    public static void main(String[] args) {
        int[] a = { 80, 50, 60,10, 20, 30, 40, 50, 60, 90 };
        int min1 = a[0];
        int min2 = a[0];

        for(int i=0;i<a.length;i++)
        {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i]<min2)
            {
                min2 = a[i];
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }
}
