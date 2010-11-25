import java.util.Arrays;

public class CountingSort {
	
	public static int[] unsortedArr = {5, 4, 7, 1, 3, 10, 9};
	public static int maxVal = 100;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Values before sort");
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
		
		countingSort(unsortedArr, 0, maxVal);
		
		System.out.println("Values after sort");
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}
	}
	
	
	public static void countingSort(int[] a, int low, int high)
	{
	    int[] counts = new int[high - low + 1]; // this will hold all possible values, from low to high
	    for (int x : a)
	        counts[x - low]++; // - low so the lowest possible value is always 0
	 
	    int current = 0;
	    for (int i = 0; i < counts.length; i++)
	    {
	        Arrays.fill(a, current, current + counts[i], i + low); // fills counts[i] elements of value i + low in current
	        current += counts[i]; // leap forward by counts[i] steps
	    }
	}

	
}

 
