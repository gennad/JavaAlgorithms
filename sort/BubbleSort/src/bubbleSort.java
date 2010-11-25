public class bubbleSort{
	
	public static int[] unsortedArr = {5, 4, 7, 1, 3, 10, 9};
	
	
	public static void main(String[] args){

		System.out.println("Values before sort");
		
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}
		System.out.println("\n");
		
		bubble_srt(unsortedArr, unsortedArr.length);
		
		System.out.println("Values after sort");
		for (int a: unsortedArr) {
			System.out.print(a + " ");
		}		
	}

	public static void bubble_srt( int a[], int n ){
		int i, j,t=0;
		for (i = 0; i < n; i++){
			for (j = 1; j < (n-i); j++) {
				if (a[j-1] > a[j]) {
					t = a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
	}
}