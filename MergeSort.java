package repetition;

public class MergeSort {

	public void merge(int[] A, int begin, int end) {

		int middle = (begin + end) / 2;

		if (begin + 1 < end) {

			merge(A, begin, middle);
			merge(A, middle, end);

			sort(A, begin, middle, end);

		}
	}

	public void sort(int[] A, int from, int mid, int to) {
		// System.out.println(to-from);

		int[] L = new int[mid - from];
		for (int i = 0, j = from; i < L.length; i++, j++) {
			L[i] = A[j];
		}

		int[] R = new int[to - mid];
		for (int i = 0, j = mid; i < R.length; i++, j++) {
			R[i] = A[j];
		}

		int indexL = 0;
		int indexR = 0;
		int indexA = from;

		while (indexA < to) {
			if ((indexL < L.length) && (indexR < R.length)) {
				if (L[indexL] < R[indexR]) {
					A[indexA] = L[indexL];
					indexA++;
					indexL++;
				} else {
					A[indexA] = R[indexR];
					indexA++;
					indexR++;
				}
			}

			if (indexL >= L.length) {
				while (indexR < R.length) {
					A[indexA] = R[indexR];
					indexA++;
					indexR++;
				}
			}
			if (indexR >= R.length) {
				while (indexL < L.length) {
					A[indexA] = L[indexL];
					indexA++;
					indexL++;
				}
			}

		}

	}
}
