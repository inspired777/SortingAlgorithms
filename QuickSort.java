package repetition;

public class QuickSort {

	public void sort(int[] A, int begin, int end) {

		int elem = A[(begin + end) / 2];

		int left = begin;
		int right = end;

		while (left <= right) {

			while (A[left] < elem) {
				left++;
			}

			while (A[right] > elem) {
				right--;
			}

			int temp = A[left];
			A[left] = A[right];
			A[right] = temp;

			left++;
			right--;
		}

		if (left < end) {
			sort(A, left, end);
		}

		if (begin < right) {
			sort(A, begin, right);
		}
	}

}
