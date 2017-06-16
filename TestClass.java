package repetition;

import java.util.Arrays;

import repetition.BubbleSort;

public class TestClass {

	public static void main(String[] args) {

		/* BubbleSort */
		int[] A = { 6, 5, 4, 3, 2, 1 };

		BubbleSort bubble = new BubbleSort();
		bubble.sort(A);
		System.out.println(Arrays.toString(A));

		/* InsertionSort */
		int[] B = { 6, 5, 4, 3, 2, 1 };

		InsertionSort insertion = new InsertionSort();
		insertion.sort(B);
		System.out.println(Arrays.toString(B));

		/* SelectionSort */
		int[] C = { 6, 5, 4, 3, 2, 1 };

		SelectionSort selection = new SelectionSort();
		selection.sort(C);
		System.out.println(Arrays.toString(C));

		/* PermSort */
		int[] D = { 6, 5, 4, 3, 2, 1 };

		PermSort perm = new PermSort();
		perm.sort(D);
		System.out.println(Arrays.toString(D));

		/* QuickSort */
		int[] E = { 6, 1, 4, 3, 2, 5 };

		QuickSort quick = new QuickSort();
		quick.sort(E, 0, E.length - 1);
		System.out.println(Arrays.toString(E));

		/* MergeSort */
		int[] F = { 6, 1, 5, 2, 3, 4 };

		MergeSort merge = new MergeSort();
		merge.merge(F, 0, F.length);
		System.out.println(Arrays.toString(F));

	}

}
