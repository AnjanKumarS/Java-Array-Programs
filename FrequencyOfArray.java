public class FrequencyOfArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1, 4, 5, 6, 2, 1, 4 ,7};
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                int c = 1;
                for (int j = i+1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        c++;
                        a[j] = -1;
                    }
                }
                if(c>=0)
                     System.out.println(a[i]+" : "+c);
            }
        }
    }
}
