package lab4;

import java.util.Scanner;

public class ConVat {
	private String giong;
	private String mauLong;
	private double canNang;
	
	public ConVat() {
		giong = "khong xac dinh";
		mauLong = "khong xac dinh";
		canNang = 0;
	}
	
	public ConVat(String giong, String mauLong, double canNang) {
		this.giong = giong;
		this.mauLong = mauLong;
		this.canNang = canNang;
	}

	public String getGiong() {
		return giong;
	}

	public void setGiong(String giong) {
		this.giong = giong;
	}

	public String getMauLong() {
		return mauLong;
	}

	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}

	public double getCanNang() {
		return canNang;
	}

	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	
	public void Keu() {
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong:");
		giong = sc.next();
		System.out.println("Nhap mau long:");
		mauLong = sc.next();
		System.out.println("Nhap can nang:");
		canNang = sc.nextDouble();
	}
	
	public void in() {
		System.out.println("giong: " + giong + ", mau long: " + mauLong + ", can nang: " + canNang);
	}
}
