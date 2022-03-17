package algorithm.sort;

public class BubbleSort {
	public static void bbsort(int[] arr) {
		int i, j, swap, k;
		for(i = 0; i < arr.length - 1; i++) {
			for(j = 0; j < arr.length - i - 1; j++) { // phan tu lon nhat auto ra sau nen khong can duyet them
				if(arr[j] > arr[j+1]) {
					swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
		for(k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {4, 3, 7, 2, 1, 8};
		bbsort(arr1);
	}
}
