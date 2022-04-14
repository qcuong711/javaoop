package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		List<SinhVienCNTT> allSVCNTT = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong SVCNTT:");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			SinhVienCNTT sv = new SinhVienCNTT();
			sv.nhapTT();
		}
	}
}
