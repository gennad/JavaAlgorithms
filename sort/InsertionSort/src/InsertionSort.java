public class InsertionSort{
	
	public static int[] unsortedArr = {12,9,4,99,120,1,3,10};
	public static int[] sortedArr;
	
	public static void main(String a[]){
		
		
		//Output unsorted array  
		System.out.print("Values Before the sort:\n");
		for (int q: unsortedArr) {
			System.out.print(q + " ");
		}
		System.out.println("\n");
		
		
		sortedArr = insertion_srt(unsortedArr, unsortedArr.length);
		
		
		//Output sorted array
		System.out.println("Values After the sort:");
		for (int q: sortedArr) {
			System.out.print(q + " ");
		}									
		                 
	}

	public static int[] insertion_srt(int array[], int n){
		for (int i = 1; i < n; i++){
			int j = i;
			int B = array[i];
			while ((j > 0) && (array[j-1] > B)){
				array[j] = array[j-1];
				j--;
			}
			array[j] = B;
		}
		
		return array;
	}
}