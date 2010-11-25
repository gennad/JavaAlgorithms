public class CombSort {
	
	public static int[] unsortedArr = {5, 4, 7, 1, 3, 10, 9};
	
	
	public static void main(String[] args) {
		
		System.out.println("Values before sort");
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
		
		sort(unsortedArr);
		
		System.out.println("Values after sort");
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}
	}
	

	
	private static int newGap(int gap)
	{       gap = gap * 10 / 13;
	        if(gap == 9 || gap == 10)
	                gap = 11;
	        if(gap < 1)
	                return 1;
	        return gap;
	}
	 
	private static void sort(int a[])
	{       
		int gap = a.length;
	    boolean swapped;
	    do {       
	    	swapped = false;
	        gap = newGap(gap);
	        for(int i = 0; i < (a.length - gap); i++) {       
	        	if(a[i] > a[i + gap]) {       
	            	swapped = true;
	                int temp = a[i];
	                a[i] = a[i + gap];
	                a[i + gap] = temp;
	            }
	        }
	        
	    } while(gap > 1 || swapped);
	}	
}








