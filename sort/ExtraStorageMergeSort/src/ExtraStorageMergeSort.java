public class ExtraStorageMergeSort{
	
	static int unsortedArray[] = {12,9,4,99,120,1,3,10};
	
	public static void main(String a[]){
		int i;
		
		int array1[] = new int[unsortedArray.length];		
		System.out.println("Values Before the sort:");
		for(i = 0; i < unsortedArray.length; i++)
			System.out.print( unsortedArray[i]+"  ");
		System.out.println("\n");
		mergeSort_srt(unsortedArray,0, unsortedArray.length-1,array1);
		System.out.print("Values after the sort:\n");
		for(i = 0; i <unsortedArray.length; i++)
		System.out.print(array1[i]+"  ");		
    }
	
	public static void mergeSort_srt(int array[], int low, int high, int array1[]){
		if(low >= high) {
			return;
		}

		int middle = (low+high) / 2;
		mergeSort_srt(array, low, middle, array1);
        mergeSort_srt(array, middle+1, high, array1);
        int k, t_low = low, t_high = middle+1;
        for(k = low; k <= high; k++)
            if ((t_low <= middle) && ((t_high > high) || (array[t_low] < array[t_high]))) {
				array1[k] = array[t_low++];
			}
            else {
				array1[k] = array[t_high++];
			}
		for(k = low; k <= high; k++) {
			array[k] = array1[k];
		}
	}
}