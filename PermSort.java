package repetition;

// сортировака перестановками
public class PermSort {

	public void sort(int[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[i]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
	}

}
