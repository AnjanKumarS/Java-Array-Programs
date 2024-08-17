public class AverageOfOddNumbers {
    public static void main(String[] args) {
        int[] a = { 1, 5, 8, 6, 4, 25, 36 };
        System.out.println(avgoddNum(a));
    }
    
    public static double avgoddNum(int[] a) {
        double sum = 0;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                sum = sum + a[i];
                c++;
            }
        }
        return sum/c;
    }
}
