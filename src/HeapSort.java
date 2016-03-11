public class HeapSort {

	public static void main(String [] args) {
		int [] test = ArrayRandomize.getRandomArray();
        heapSort(test);
		for (int aTest : test) {
			System.out.println(aTest);
		}
	}

	public static void heapSort(int [] arr) {
		/*
			First, create a POV tree by using pushdown on every element from the reversed order of the array.
			With other words from n then n-1 and so on until index 0.
		*/
		makePOV(arr);
		//We now have a POV tree
		

		int p = arr.length - 1;	
		while (p > 0) {
			//Swap the first element with the last
			SortingHelper.swap(arr,p,0);

			//Pushdown the "old" last element.
			pushDown(arr,0,p);
			//Make sure we lower where the "new" end of the array is located.
			p--;
		}

		//Since I was stupid enough to use a min heap rather than a max heap we here have to make it ascending.
		for (int start = 0, end = arr.length-1; start< end; start++, end--) {
			SortingHelper.swap(arr,start,end);
		}
		
	}

	public static void pushDown(int [] arr, int elementToPush, int last) {
		//Left child at 2*i + 1 and right child at 2*i + 2
		if ((elementToPush * 2) +1 < last) {
			//We know have atleast a left child so get the index for that element.
			int minPos = elementToPush * 2 + 1;
			
			//Do we have a right child?
			if ((elementToPush * 2) + 2 < last) {
				//Is the right child less worth than the left child?
				if ((arr[(elementToPush * 2) + 2]) < arr[minPos]) {
					//Make sure we change minPos with the right child's position since it's less worth
					minPos = elementToPush * 2 + 2;
				} 
			}
			// Check if the least valuable child is less worth than the element to push
			if (arr[minPos] < arr[elementToPush]) {
				SortingHelper.swap(arr,elementToPush, minPos);
				//Continue pushdown with the element
				pushDown(arr,minPos,last);
			}
		}
	}

	/*
		Creates a min Heap from the unsorted array.
	*/
	public static void makePOV(int [] arr) {
		//We don't need to check the leaves.
		for (int i = arr.length/2 - 1; i >= 0; i--) {
			pushDown(arr, i, arr.length-1);
		}
	}
}