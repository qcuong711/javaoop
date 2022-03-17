package algorithm.sort;

public class SelectionSort {	
	public static void selSort(int[] arr) {
		int i, j, indexMin, swap;
		for(i = 0; i < arr.length; i++) {
			indexMin = i;
			for(j = i + 1; j < arr.length; j++) {
				if(arr[indexMin] > arr[j]) {
					indexMin = j;
				}
			}
			
			if(indexMin != i) {
				swap = arr[i];
				arr[i] = arr[indexMin];
				arr[indexMin] = swap;
			}			
		}
		
		for(int k : arr) {
			System.out.print(k + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 7, 2, 8, 9, 10, 3};
		selSort(arr);
	}
}
