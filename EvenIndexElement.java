
public class EvenIndexElement {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };
        evenIndEle(a);
    }
    
    public static void evenIndEle(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(i%2==0)
                System.out.println(a[i]);
        }
    }
}
