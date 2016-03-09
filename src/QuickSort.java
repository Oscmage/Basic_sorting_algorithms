public class QuickSort {

      public static void main (String [] args) {
            int [] test = ArrayRandomize.getRandomArray();
            quickSort(test, 0, test.length - 1);
            for (int aTest : test) {
                  System.out.println(aTest);
            }
      }

      public static int partition(int arr[], int left, int right) {
            
            int tmp;
            int pivot = arr[(left + right) / 2];
           
            while (left <= right) {

                  //Loop until we find something that needs to be swaped
                  while (arr[left] < pivot) {
                        left++;    
                  } 

                  //Loop until we find something that needs to be swaped
                  while (arr[right] > pivot) {
                         right--;
                  }

                  //When we get here we know that both the 
                  //pointers are pointing at something that needs to be swapped.
                  if (left <= right) {
                        tmp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = tmp;
                        left++;
                        right--;
                  }
            }
            return left;
      }

      public static void quickSort(int arr[], int left, int right) {
            int pivIdx = partition(arr, left, right);

            if (left < pivIdx - 1) {
                   quickSort(arr, left, pivIdx - 1);      
            }
            
            if (pivIdx < right) {
                 quickSort(arr, pivIdx, right); 
            }
      }
}