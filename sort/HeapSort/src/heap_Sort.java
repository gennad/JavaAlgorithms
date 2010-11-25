public class heap_Sort{
	
	public static int[] unsortedArr = {10, 3, 6, 1, 7, 4};
	
	public static void main(String a[]){
		
		
		//Output unsorted array  
		System.out.print("Values Before the sort:\n");
		for (int q: unsortedArr) {
			System.out.print(q + " ");
		}
		System.out.println("\n");
		
		int i;
		for(i=unsortedArr.length; i>1; i--){
			fnSortHeap(unsortedArr, i - 1);
		}
		
		//Output sorted array
		System.out.println("Values After the sort:");
		for (int q: unsortedArr) {
			System.out.print(q + " ");
		}									
	}

	public static void fnSortHeap(int array[], int arr_ubound){
		int i, o;
        int lChild, rChild, mChild, root, temp;
		root = (arr_ubound-1)/2;

		for(o = root; o >= 0; o--){
			for(i=root;i>=0;i--){
				lChild = (2*i)+1;
                rChild = (2*i)+2;
				if((lChild <= arr_ubound) && (rChild <= arr_ubound)){
					if(array[rChild] >= array[lChild])
						mChild = rChild;
					else
						mChild = lChild;
				}
                else{
					if(rChild > arr_ubound)
						mChild = lChild;
					else
						mChild = rChild;
				}

				if(array[i] < array[mChild]){
					temp = array[i];
					array[i] = array[mChild];
                    array[mChild] = temp;
				}
			}
		}
		temp = array[0];
		array[0] = array[arr_ubound];
		array[arr_ubound] = temp;
		return;
	}
}