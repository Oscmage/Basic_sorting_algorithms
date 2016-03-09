public class InsertionSort {

	public static void main (String [] args) {
		int [] test = ArrayRandomize.getRandomArray();
		InsertionSort(test);
		for (int aTest : test) {
			System.out.println(aTest);
		}
	}

	public static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while ((j > 0) && arr[j-1] > arr[j]) {
				SortingHelper.swap(arr,j,j-1);
				j--;
			}
		}
	}
}