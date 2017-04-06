package repetition;


public class BubbleSort {
	
	public void sort(int[]A) {
		for(int i=1; i<A.length; i++) {
			for (int j = A.length-1; j>=i; j--) {
				if(A[j]<A[j-1]) {
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
				}
			}
		}
	}

}
