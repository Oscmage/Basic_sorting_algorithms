public class SelectionSort {

	public static void main(String [] args) {
		int [] test = {20,1,4,7,2,8,10,19,18,17};
		selectionSort(test);
		for (int i = 0; i < test.length; i++){
			System.out.println(test[i]);
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
        	swap(arr, j, minPos);
		}
	}

	public static void swap(int [] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}