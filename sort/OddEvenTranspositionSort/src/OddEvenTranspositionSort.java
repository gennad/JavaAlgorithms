public class OddEvenTranspositionSort {
	
	public static int array[] = {12,9,4,99,120,1,3,10,13};
	
	public static void main(String a[]){
		
		int i;		
				
		System.out.println("Values Before the sort:\n");
		
		for(i = 0; i < array.length; i++)
			System.out.print( array[i]+"  ");
		System.out.println();
		
		odd_even_srt(array, array.length);
		System.out.print("Values after the sort:\n");
		
		// values are passed by link
		
		for(i = 0; i <array.length; i++)
			System.out.print(array[i]+"  ");				
	}

	public static void odd_even_srt(int array[],int n){
		for (int i = 0; i < n/2; i++ ) {
			for (int j = 0; j+1 < n; j += 2)
				if (array[j] > array[j+1]) {
					int T = array[j];
					array[j] = array[j+1];
					array[j+1] = T;
				}
			for (int j = 1; j+1 < array.length; j += 2)
				if (array[j] > array[j+1]) {
					int T = array[j];
					array[j] = array[j+1];
					array[j+1] = T;
				}
		}
	}
}