package lab3.bai2;

import lab2.bai1.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A, B);
		System.out.println("AB: " + AB);
		AB.tinhTien(5, 3);
		System.out.println("AB sau khi tinh tien: " + AB);
		
		DoanThang CD = new DoanThang();
		CD.nhap();
		System.out.println(CD);
		System.out.println("Do dai doan thang CD la: " + CD.doDaiDT());
	}
}