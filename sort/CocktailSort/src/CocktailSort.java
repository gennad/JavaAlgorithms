public class CocktailSort {
	
	public static int[] unsortedArr = {5, 4, 7, 1, 3, 10, 9};
	
	
	public static void main(String[] args) {
		
		System.out.println("Values before sort");
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
		
		cocktailSort(unsortedArr);
		
		System.out.println("Values after sort");
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}
	}
	
	public static int[] cocktailSort(int[] numbers) {
		boolean swapped = true;
        int i = 0;
        int j = numbers.length - 1;
        while(i < j && swapped) {
           swapped = false;
           for(int k = i; k < j; k++) {
              if(numbers[k] > numbers[k + 1]) {
                 int temp = numbers[k];
                 numbers[k] = numbers[k + 1];
                 numbers[k + 1] = temp;
                 swapped = true;
              }
           }
           j--;
           if(swapped) {
              swapped = false;
              for(int k = j; k > i; k--) {
                 if(numbers[k] < numbers[k - 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k - 1];
                    numbers[k - 1] = temp;
                    swapped = true;
                 }
              }
           }
           i++;
        }
        return numbers;
	}
}




