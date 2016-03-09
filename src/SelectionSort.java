public class SelectionSort {

	public static void main(String [] args) {
		int [] test = ArrayRandomize.getRandomArray();
		selectionSort(test);
		for (int i : test) {
			System.out.println(i);
		}
	}

	public static void selectionSort(int[] arr) {
		
		for (int j = 0; j < arr.length; j++) {
		    int minPos = j;
		 	//Check every element after the current element to find the smalest.
		    for (int  i = j+1; i < arr.length; i++) {
		        if (arr[i] < arr[minPos]) {
		        	//Lets add the smallest value to index
		            minPos = i;
		        }
		    }
        	SortingHelper.swap(arr, j, minPos);
		}
	}
}