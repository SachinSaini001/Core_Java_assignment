import java.util.Arrays;

class Question2 {
    public static void sortBinary(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[k++] = 0;
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[k++] = 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println("Before Sorting " + Arrays.toString(arr));
        sortBinary(arr);
        System.out.println("After Sorting " + Arrays.toString(arr));

    }
}