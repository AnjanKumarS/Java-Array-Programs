import java.util.ArrayList;
import java.util.List;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        int a [] = { 1, 2, 5, 3, 2, 4, 5, 6, 8, 4, 1, 2 };
        uniqueElements(a);
    }

    private static void uniqueElements(int [] a) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                int c = 0;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        c++;
                        a[j] = -1;
                    }
                }
                if (c==0)
                    l.add(a[i]);
            }
        }
        System.out.println(l);
    }
}
