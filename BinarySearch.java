public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 5, 60, 70, 80 };
        int ele = 30;
        boolean flag = binarySearch(a, ele);
        System.out.println(flag?"Ele Found":"Ele Not Found");
    }

    private static boolean binarySearch(int[] a, int ele) {
        int l = 0;
        int h = a.length - 1;
        while (l <= h)
        {
            int mid = (l + h) / 2;
            if (a[mid] == ele)
            {
                return true;
            }
            else if(ele>a[mid])
            {
                l = mid + 1;
            }
            else if(a[mid]>ele)
            {
                h = mid - 1;
            }
        }
        return false;
    }
}
