package algorithm.search;

public class BinarySearch {
	public static int binSearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;	
		while (left <= right) {
			int middle = (left + right)/2;
			if (num < arr[middle]) {
				right = middle - 1;
			} else if (num > arr[middle]) {
				left = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// yeu cau mang da sap xep
		int[] arr1 = {-212, 1, 45, 66, 188, 327, 900};
		System.out.println(binSearch(arr1, 327));
	}
}
