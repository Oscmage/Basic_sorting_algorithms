public class InsertionSort {

	public static void main (String [] args) {
		int [] test = {2,1,4,7,20,8,10,19,18,17};
		InsertionSort(test);
		for (int i = 0; i < test.length; i++){
			System.out.println(test[i]);
		}
	}

	public static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while ((j > 0) && arr[j-1] > arr[j]) {
				swap(arr,j,j-1);
				j--;
			}
		}
	}

	public static void swap(int [] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}