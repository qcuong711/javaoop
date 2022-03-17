package lab1.bai8;

import java.util.Scanner;

public class XuLyDanhSachSoNguyen {
	// bubble sort
	public static void bubbleSort(int arr[]) {
        int i, j, temp;

        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ban muon nhap bao nhieu so: ");
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap so thu " + i + ": ");
			a[i] = sc.nextInt();
		}
				
		System.out.print("Nhap so muon kiem tra: ");
		int b = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (a[i] == b) {
				count++;
			}
		}
		
		System.out.println("Co " + count + " so " + b);
		
		System.out.print("Mang truoc khi sap xep: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
		XuLyDanhSachSoNguyen.bubbleSort(a);
		
		System.out.println();
		
		System.out.print("Mang sau khi sap xep: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}
