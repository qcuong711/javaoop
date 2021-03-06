package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon {

	private String mso;
	private String tde;
	private String nvien;
	private KhachHang khachHang;
	private ArrayList<ChiTiet> danhSachHangHoa;
	private MyDate ngayXuat;
	
	public HoaDon() {
		danhSachHangHoa = new ArrayList<ChiTiet>();
	}

	public HoaDon(String mso, String tde, String nvien, KhachHang khachHang, 
			ArrayList<ChiTiet> chiTiet, MyDate ngayXuat) {
		this.mso = mso;
		this.tde = tde;
		this.nvien = nvien;
		this.khachHang = khachHang;
		danhSachHangHoa = new ArrayList<ChiTiet>();
		this.ngayXuat = ngayXuat;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		mso = sc.next();
		System.out.print("Nhap tieu de: ");
		tde = sc.next();
		System.out.print("Nhap ten nhan vien: ");
		nvien = sc.next();
		khachHang.nhap();
		
		System.out.print("Nhap so luong san pham: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			ChiTiet chiTiet = new ChiTiet();
			chiTiet.nhap();
			danhSachHangHoa.add(chiTiet);
		}
		
		ngayXuat.nhapNgay();
	}
	
	public void in() {
		
	}
}
