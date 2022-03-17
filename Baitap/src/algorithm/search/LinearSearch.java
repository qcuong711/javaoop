package algorithm.search;

public class LinearSearch {
	public static int linSearch(int[] arr, int number) {
		int i;
		for(i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 4, 1, 5, 8, 6, 0};
		int num = 0;
		int result = linSearch(arr, num);
		if(result == -1) {
			System.out.println("ko co gia tri " + num + " trong mang");
		} else{
			System.out.println("gia tri " + num + " o vi tri thu " + (int)(result + 1));
		}
	}
}
