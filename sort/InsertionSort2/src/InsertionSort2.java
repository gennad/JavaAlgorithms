public class InsertionSort2 {

	public static int[] unsortedArray = {4, 7, 1, 10, 9, 3, 100, 54, 32};
	public static int[] sortedArray;
		
	public static void main(String[] args) {
		
		//Output unsorted array
		System.out.println("Unsorted array:");
		for (int a: unsortedArray) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		//call sorting method
		sortedArray = insertionsort(unsortedArray);
		
		//Output sorted array
		System.out.println("Sorted array:");
		for (int a: sortedArray) {
			System.out.print(a + " ");
		}
	}
	
	public static int[] insertionsort(int[] numbers) {
	    for (int i = 0; i < numbers.length; i++) {
	        int copyNumber = numbers[i];
	        int j = i;
	        while (j > 0 && copyNumber < numbers[j-1]) {
	            numbers[j] = numbers[j-1];
	            j--;
	        }
	        numbers[j] = copyNumber;
	    }
	    return numbers;
	}
}










