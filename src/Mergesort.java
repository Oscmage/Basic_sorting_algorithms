public class MergeSort {

	public static void main (String [] args) {
		int [] sortedArray = mergeSort(ArrayRandomize.getRandomArray());
		for (int aSortedArray : sortedArray) {
			System.out.println(aSortedArray);
		}
	}

	public static int [] mergeSort(int [] input) {
		if (input.length <= 1) {
			return input;
		}

		int[] left = new int[input.length / 2];
		int[] right = new int[input.length - left.length];

		System.arraycopy(input, 0, left, 0, left.length);
		System.arraycopy(input, left.length, right, 0, right.length);

		left = mergeSort(left);
		right = mergeSort(right);

		return merge(left, right);
	}


	public static int [] merge(int [] leftArray, int [] rightArray) {

		int leftPointer = 0, rightPointer = 0, tempPointer = 0;

		int [] sortedArray = new int [leftArray.length + rightArray.length];

		while (leftPointer < leftArray.length && rightPointer < rightArray.length) {

			if (leftArray[leftPointer] < rightArray[rightPointer]) {
				sortedArray[tempPointer] = leftArray[leftPointer];
				leftPointer++;
			} else {
				sortedArray[tempPointer] = rightArray[rightPointer];
				rightPointer++;
			}
			tempPointer++;
		}

		while (leftPointer < leftArray.length) {
			sortedArray[tempPointer++] = leftArray[leftPointer++];
		}

		while (rightPointer < rightArray.length) {
			sortedArray[tempPointer++] = rightArray[rightPointer++];
		}

		return sortedArray;
	}
}