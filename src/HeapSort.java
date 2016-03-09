public class HeapSort {

	public static void main(String [] args) {
		int [] test = {2,1,4,7,20,8,10,19,18,17};
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
		/* 
			Then swap the element at positon 0 with the last. 
		*/
		int p = arr.length - 1;	
		while (p > 0) {
			//Swap the first element with the last
			swap(arr,p,0);

			//Pushdown the "old" last element.
			pushDown(arr,0,p);
			//Make sure we lower where the "new" end of the array is located.
			p--;
		}

		for (int start = 0, end = arr.length-1; start< end; start++, end--) {
			swap(arr,start,end);
		}
		
	}

	public static void pushDown(int [] arr, int elementToPush, int last) {
		//Left child at 2*i and right child at 2*i +1
		if (elementToPush * 2 < last) {
			//We know have atleast a left child so get the index for that element.
			int minPos = elementToPush * 2;
			
			//Do we have a right child?
			if ((elementToPush * 2) + 1 < last) {
				//Is the right child less worth than the left child?
				if ((arr[(elementToPush * 2) + 1]) < arr[minPos]) {
					minPos = elementToPush * 2 + 1;
					//Make sure we swap with the right child since it's less worth
				} 
			}
			// Check if the least valuable child is less worth than the element to push
			if (arr[minPos] < arr[elementToPush]) {
				swap(arr,elementToPush, minPos);
				//Continue pushdown with the element
				pushDown(arr,minPos,last);
			}
		}
	}

	/*
		Creates a min Heap from the unsorted array.
	*/
	public static void makePOV(int [] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			pushDown(arr, i, arr.length-1);
		}
	}

	public static void swap(int [] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
}