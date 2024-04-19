public class ArraySearch {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int key = 4;
        int f = -1; // Initialize f with -1 to indicate element not found
        int l = 0, h = a.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] == key) {
                f = mid;
                break; // Element found, exit the loop
            } else if (a[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        if (f == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found at index: " + f);
        }
    }
}
