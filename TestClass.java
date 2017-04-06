package repetition;
import java.util.Arrays;

import repetition.BubbleSort;

public class TestClass {

	public static void main(String[] args) {

		int[] A = { 6, 5, 4, 3, 2, 1 };
		
		BubbleSort bubble = new BubbleSort();
		bubble.sort(A);
		System.out.println(Arrays.toString(A));
		
		
		int[] B = { 6, 5, 4, 3, 2, 1 };
		
		InsertionSort insertion = new InsertionSort();
		insertion.sort(B);
		System.out.println(Arrays.toString(B));
		
		int[] C = { 6, 5, 4, 3, 2, 1 };
		
		SelectionSort selection = new SelectionSort();
		selection.sort(C);
		System.out.println(Arrays.toString(C));		
	}

}
