package ru.gennad.bogosort;

import java.util.Random;



public class Bogosort {
	static Random random = new Random();
	 
	public static void bogoSort(int[] n) {
	    while(!inOrder(n)) shuffle(n);
	}
	 
	public static void shuffle(int[] n) {
	    for (int i = 0; i < n.length; i++) {
	        int swapPosition = random.nextInt(i + 1);
	        int temp = n[i];
	        n[i] = n[swapPosition];
	        n[swapPosition] = temp;
	    }
	}
	 
	public static boolean inOrder(int[] n) {
	    for (int i = 0; i < n.length-1; i++) {
	        if (n[i] > n[i+1]) return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		bogoSort(new int[]{5, 10, 30, 1, 7, 10, 34, 1000, 3});
	}

}


