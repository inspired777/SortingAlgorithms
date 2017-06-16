package repetition;

public class SelectionSort {
	public void sort(int[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			int min = A[i];
			int index = i;

			for (int j = i + 1; j < A.length; j++) {
				if (min > A[j]) {
					min = A[j];
					index = j;
				}
			}

			A[index] = A[i];
			A[i] = min;
		}

	}

}
