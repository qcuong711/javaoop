package algorithm.sort;

public class InsertionSort {
	public static void insSort(int[] arr) {
		int insVal, possibleIndex;
		for (int i = 1; i < arr.length; i++) {
			insVal = arr[i];    // gia tri dung de sap xep
			possibleIndex = i;  // vi tri co the sap xep gia tri insVal
			while(possibleIndex > 0 && arr[possibleIndex - 1] > insVal) {
				arr[possibleIndex] = arr[possibleIndex - 1];
				possibleIndex--;
			}
			arr[possibleIndex] = insVal;
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 5, 4, 7, 8, 1, 0, 2};
		insSort(arr);
	}
}
