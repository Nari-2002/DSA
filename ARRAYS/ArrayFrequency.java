public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 5,2, 2, 3, 3, 3, 4, 4, 4, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (!alreadyPrinted) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println("Number " + arr[i] + " appears " + count + " times");
            }
        }
    }
}
