import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

	// combines 2 ArrayLists into 1 sorted array, logging the time it takes to do so.

	public static void main (String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// creates 2 ArrayLists containing nums 1-500000 in order
		for(int i = 1; i < 250000; i++) {
			list1.add(i);
		}
		for(int i = 250000; i < 500001; i++) {
			list2.add(i);
		}
		// takes elements from ArrayLists & stores in Arrays
		Integer[] A = list1.toArray(new Integer[list1.size()]);
		Integer[] B = list2.toArray(new Integer[list2.size()]);
			
		// long start time 
		long startTime = System.currentTimeMillis();
		
		combineArrays(A, B);  // creates combined array
		
		// log end time 	
		long endTime = System.currentTimeMillis();
		
		// prints total time it took to combine array
		System.out.println("Time taken: " + (endTime - startTime) + " milliseconds.");	
	}

	public static Integer[] combineArrays (Integer[] a, Integer[] b){
		
		// variable holding total length of both arrays
		int length = a.length + b.length;

		// makes length of C the total length of A and B
		Integer[] c = new Integer[length];

		// position index in array
		int pos = 0;

		for(Integer i : a) {
			c[pos] = i;
			pos++;  
		}
		for(Integer i : b) {
			c[pos] = i;
			pos++;  
		}
//		for(Integer i : c) {
//			System.out.println(i);
//		}
		System.out.println("Arrays combined!");
		
		return null;
	}


}
