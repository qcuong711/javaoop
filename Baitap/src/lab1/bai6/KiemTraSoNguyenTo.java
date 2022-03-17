package lab1.bai6;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
	public static boolean SoNguyenTo(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so:");
		int n = sc.nextInt();
		boolean check = SoNguyenTo(n);
		
		if(check) {
			System.out.println(n + " la so nguyen to");
		} else {
			System.out.println(n + " ko phai la so nguyen to");
		}
		
		System.out.println("So nhi phan cua " + n + " la " + Integer.toBinaryString(n));
	}
}
