public class BubbleSort {

	public static void main(String [] args) {
		int [] test = ArrayRandomize.getRandomArray();
		bubbleSort(test);
		for (int aTest : test) {
			System.out.println(aTest);
		}
	}

	public static void bubbleSort(int [] arr) {
		int amountOfRuns = 0;
		while (amountOfRuns < arr.length) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i+1]) {
					SortingHelper.swap(arr,i,i+1);
				}
			}
			amountOfRuns++;
		}
	}
}