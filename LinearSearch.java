public class LinearSearch {
    public static void main(String[] args) {
        int a[] = { 10, 56, 23, 45, 85, 75, 65 };
        int ele = 56;
        boolean flag = false;

        for(int i=0;i<a.length;i++)
        {
            if (a[i] == ele)
                flag = true;
        }
        
        if(flag)
            System.out.println("Ele found");
        else
            System.out.println("Not Ele found");
    }
}
