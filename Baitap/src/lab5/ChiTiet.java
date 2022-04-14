package lab5;

import java.util.Scanner;

public class ChiTiet {

	private int sluong;
	private float dgia;
	private HangHoa loaiHang;
	
	public ChiTiet() {
		
	}
	
	public ChiTiet(int sluong, int dgia, HangHoa loaiHang) {
		this.sluong = sluong;
		this.dgia = dgia;
		this.loaiHang = loaiHang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thong tin chi tiet:");
		System.out.print("Nhap loai hang hoa:");
		loaiHang.nhap();
		System.out.print("Nhap so luong: ");
		sluong = sc.nextInt();
		System.out.print("Nhap loai hang: ");
		dgia = sc.nextFloat();
	}
	
	public void in() {
		loaiHang.in();
		System.out.print("So luong:" + sluong + ", loai hang: " + dgia);	
	}
}
