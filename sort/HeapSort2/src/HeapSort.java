public class HeapSort {

	public static int[] unsortedArr = {10, 5, 34, 2, 55, 32, 1, 7, 3};
	public static int[] sortedArr;
	
	public static void main(String[] args) {
		//Output unsorted array  
		System.out.print("Values Before the sort:\n");
		for (int q: unsortedArr) {
			System.out.print(q + " ");
		}
		System.out.println("\n");
		
		
		heapSort(unsortedArr);
		sortedArr = unsortedArr;
					
		//Output sorted array
		System.out.println("Values After the sort:");
		for (int q: sortedArr) {
			System.out.print(q + " ");
		}
	}
	
	
	/**
	 * Heapsort for sorting an array of integers.
	 * @param array the array to be sorted
	 */
	public static void heapSort(int[] array) {
	    /* This method performs an in-place heapsort. Starting
	     * from the beginning of the array, the array is swapped
	     * into a binary max heap.  Then elements are removed
	     * from the heap, and added to the front of the sorted
	     * section of the array. */
	 
	    /* Insertion onto heap */
	    for (int heapsize=0; heapsize<array.length; heapsize++) {
	        /* Step one in adding an element to the heap in the
	         * place that element at the end of the heap array-
	         * in this case, the element is already there. */
	        int n = heapsize; // the index of the inserted int
	        while (n > 0) { // until we reach the root of the heap
	            int p = (n-1)/2; // the index of the parent of n
	            if (array[n] > array[p]) { // child is larger than parent
	                arraySwap(array, n, p); // swap child with parent
	                n = p; // check parent
	            }
	            else // parent is larger than child
	                break; // all is good in the heap
	        }
	    }
	 
	    /* Removal from heap */
	    for (int heapsize=array.length; heapsize>0;) {
	        arraySwap(array, 0, --heapsize); // swap root with the last heap element
	        int n = 0; // index of the element being moved down the tree
	        while (true) {
	            int left = (n*2)+1;
	            if (left >= heapsize) // node has no left child
	                break; // reached the bottom; heap is heapified
	            int right = left+1;
	            if (right >= heapsize) { // node has a left child, but no right child
	                if (array[left] > array[n]) // if left child is greater than node
	                    arraySwap(array, left, n); // swap left child with node
	                break; // heap is heapified
	            }
	            if (array[left] > array[n]) { // (left > n)
	                if (array[left] > array[right]) { // (left > right) & (left > n)
	                    arraySwap(array, left, n);
	                    n = left; continue; // continue recursion on left child
	                } else { // (right > left > n)
	                    arraySwap(array, right, n);
	                    n = right; continue; // continue recursion on right child
	                }
	            } else { // (n > left)
	                if (array[right] > array[n]) { // (right > n > left)
	                    arraySwap(array, right, n);
	                    n = right; continue; // continue recursion on right child
	                } else { // (n > left) & (n > right)
	                    break; // node is greater than both children, so it's heapified
	                }
	            }
	        }
	    }
	}

	
}



