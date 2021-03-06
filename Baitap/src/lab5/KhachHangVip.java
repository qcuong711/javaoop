package lab5;

import java.util.Scanner;

public class KhachHangVip extends KhachHang {

	private float tLeGiam;
	
	private MyDate ngayGiaNhapVip;
	
	public KhachHangVip() {
		super();
	}
	
	public KhachHangVip(String cccd, String hten, String dchi, float tLeGiam, MyDate ngayGiaNhapVip) {
		super(cccd, hten, dchi);
		this.tLeGiam = tLeGiam;
		this.ngayGiaNhapVip = ngayGiaNhapVip;
	}

	public float gettLeGiam() {
		return tLeGiam;
	}

	public void settLeGiam(float tLeGiam) {
		this.tLeGiam = tLeGiam;
	}
	
	public MyDate getNgayGiaNhapVip() {
		return ngayGiaNhapVip;
	}

	public void setNgayGiaNhapVip(MyDate ngayGiaNhapVip) {
		this.ngayGiaNhapVip = ngayGiaNhapVip;
	}

	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap ty le giam: ");
		tLeGiam = sc.nextFloat();
		System.out.print("Nhap ngay gia nhap vip: ");
		ngayGiaNhapVip.nhapNgay();
	}
	
	@Override
	public void in() {
		super.in();
		System.out.print("ty le giam: " + tLeGiam);
		ngayGiaNhapVip.hienThi();
	}
}
