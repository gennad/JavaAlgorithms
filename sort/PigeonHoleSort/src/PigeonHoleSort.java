public class PigeonHoleSort {
	
	public static void main(String[] args) {
		int[] arr = {5, 3, 100, 45, 22, 99, 1, 2};
		pigeonhole_sort(arr);
	}
	
	
	public static void pigeonhole_sort(int[] a)
	{
	    // size of range of values in the list 
		// (ie, number of pigeonholes we need)
	    int min = a[0], max = a[0];
	    for (int x : a) {
	        min = Math.min(x, min);
	        max = Math.max(x, max);
	    }
	    final int size = max - min + 1;
	 
	    // our array of pigeonholes
	    int[] holes = new int[size];  
	 
	    // Populate the pigeonholes.
	    for (int x : a)
	        holes[x - min]++;
	 
	    // Put the elements back into the array in order.
	    int i = 0;
	    for (int count = 0; count < size; count++)
	        while (holes[count]-- > 0)
	            a[i++] = count + min;
	    
	    for (int v: a) {
	    	System.out.print(v + " ") ;
	    }
	}

}

