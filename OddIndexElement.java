
public class OddIndexElement {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };
        oddIndEle(a);
    }
    
    public static void oddIndEle(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(i%2==1)
                System.out.println(a[i]);
        }
    }
}
