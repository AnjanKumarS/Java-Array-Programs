public class ToCharArray {
    public static void main(String[] args) {
        String s = "welcome to java";
        char[] res = s.toCharArray();

        for (int i = res.length - 1; i >= 0; i--) {
            System.out.print(res[i]);
        }
    }
}
