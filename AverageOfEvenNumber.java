public class AverageOfEvenNumber {
    public static void main(String[] args) {
        int[] a = { 1, 5, 8, 6, 4, 25, 36 };
        System.out.println(avgevenNum(a));
    }

    
    public static double avgevenNum(int[] a) {
        double sum = 0;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum= sum + a[i];
                c++;
            }
        }
        return sum/c;
    }
}
