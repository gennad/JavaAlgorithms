public class SelectionSort2 {
	public static int[] selectionsort(int[] numbers){
	    for (int i = 0; i < numbers.length; i++)
	    {
	        int index = i;
	        for (int j = i+1; j < numbers.length; j++)
	            if (numbers[j] < numbers[index]) //Finds smallest number
	                index = j;  
	 
	        int smallerNumber = numbers[index];  //Swap
	        numbers[index] = numbers[i];
	        numbers[i] = smallerNumber;
	 
	    }
	    return numbers;
	}

}


