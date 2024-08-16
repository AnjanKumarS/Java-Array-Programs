import java.util.Arrays;

/**
 * ExampleProgram
 */
public class ExampleProgram {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr = { 10, 10 + 20, a, a + b, 'A', (int) 10.0 };
        System.out.println(arr.length); //6
        System.out.println(arr); //[I@hexadecimalvalue
        System.out.println(Arrays.toString(arr)); //[10, 30, 10, 30, 65, 10]
    }
}