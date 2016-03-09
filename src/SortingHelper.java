
public class SortingHelper {

    /**
     * Swaps the two elements at the provided indexes i1 and i2
     */
    public static void swap(int [] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
