public class GnomeSort {
	
	public static int[] unsortedArr = {7, 2, 6, 10, 4, 56, 1};
	
	public static void main(String[] args) {
		
		//Output unsorted array  
		System.out.print("Values Before the sort:\n");
		for (int q: unsortedArr) {
			System.out.print(q + " ");
		}
		System.out.println("\n");
		
		gnomeSort(unsortedArr);
		
		//Output sorted array
		System.out.println("Values After the sort:");
		for (int q: unsortedArr) {
			System.out.print(q + " ");
		}							
	}
	
	
	static void gnomeSort( int[] theArray ) { 
		for ( int index = 1; index < theArray.length; ) { 
			if ( theArray[index - 1] <= theArray[index] ) { 
				++index; 
			} 
			else { 
	            int tempVal = theArray[index]; 
	            theArray[index] = theArray[index - 1]; 
	            theArray[index - 1] = tempVal; 
	            --index; 
            if ( index == 0 ) { 
            	index = 1; 
            }           
         } 
      } 
   } 
}
