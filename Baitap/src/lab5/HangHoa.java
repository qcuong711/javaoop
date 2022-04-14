package lab5;

import java.util.Scanner;

public class HangHoa {

	private String mso;
	private String ten;
	private String nsxuat;
	
	public HangHoa() {
		
	}
	
	public HangHoa(String mso, String ten, String nsxuat) {
		this.mso = mso;
		this.ten = ten;
		this.nsxuat = nsxuat;
	}

	public String getMso() {
		return mso;
	}

	public void setMso(String mso) {
		this.mso = mso;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNsxuat() {
		return nsxuat;
	}

	public void setNsxuat(String nsxuat) {
		this.nsxuat = nsxuat;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thong tin hang hoa:");
		System.out.print("Nhap ma so: ");
		mso = sc.next();
		System.out.print("Nhap ten: ");
		ten = sc.next();
		System.out.print("Nhap nha sx: ");
		nsxuat = sc.next();
	}
	
	public void in() {
		System.out.print("Ma so: " + mso + ", ten: " + ten + ", nha sx: " + nsxuat);
	}
}
