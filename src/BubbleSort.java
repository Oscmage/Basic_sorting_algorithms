public class BubbleSort {

	public static void main(String [] args) {
		int [] test = {20,1,4,7,2,8,10,19,18,17};
		bubbleSort(test);
		for (int i = 0; i < test.length; i++){
			System.out.println(test[i]);
		}
	}

	public static void bubbleSort(int [] arr) {
		int amountOfRuns = 0;
		while (amountOfRuns < arr.length) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i+1]) {
					swap(arr,i,i+1);
				}
			}
			amountOfRuns++;
		}
	}

	public static void swap(int [] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}