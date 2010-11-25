public class selectionSort{
	public static void main(String a[]){
		int i;
		int array[] = {12,9,4,99,120,1,3,10};
		System.out.println("\n\n       RoseIndia\n\n");
		System.out.println("       Selection Sort\n\n");   
		System.out.println("Values Before the sort:\n");    
		for(i = 0; i < array.length; i++)
			System.out.print( array[i]+"  ");
		System.out.println();
		selection_srt(array, array.length);        
		System.out.print("Values after the sort:\n");    
		for(i = 0; i <array.length; i++)
			System.out.print(array[i]+"  ");
		System.out.println();
		System.out.println("PAUSE");
	}

	public static void selection_srt(int array[], int n){
		for(int x=0; x<n; x++){
			int index_of_min = x;
			for(int y=x; y<n; y++){
				if(array[index_of_min]<array[y]){
					index_of_min = y;
				}
			}
			int temp = array[x];
			array[x] = array[index_of_min];
			array[index_of_min] = temp;
		}
	}
}