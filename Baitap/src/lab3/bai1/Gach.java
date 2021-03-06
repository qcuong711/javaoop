package lab3.bai1;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int soluongmh;
	private int chieudai;
	private int chieungang;
	private long giabanmh;
	
	// constructor 1
	public Gach() {
		maso = "init1";
		mau = "trang";
		soluongmh = 10;
		chieudai = 40;
		chieungang = 30;
		giabanmh = 100000;
	}
	
	// constructor 2
	public Gach(String maso, String mau, int soluongmh, int chieudai, int chieungang, long giabanmh) {
		this.maso = maso;
		this.mau = mau;
		this.soluongmh = soluongmh;
		this.chieudai = chieudai;
		this.chieungang = chieungang;
		this.giabanmh = giabanmh;
	}
	
	//getter
	public String getMaso() {
		return maso;
	}
	
	public String getMau() {
		return mau;
	}
	
	public int getSoluongmh() {
		return soluongmh;
	}
	
	public int getChieudai() {
		return chieudai;
	}
	
	public int getChieungang() {
		return chieungang;
	}
	
	public long getGiabanmh() {
		return giabanmh;
	}
	
	// ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maso = sc.nextLine();
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
		System.out.print("Nhap so luong moi hop: ");
		soluongmh = sc.nextInt();
		System.out.print("Nhap chieu dai: ");
		chieudai = sc.nextInt();
		System.out.print("Nhap chieu ngang: ");
		chieungang = sc.nextInt();
		System.out.print("Nhap gia ban moi hop: ");
		giabanmh = sc.nextInt();
	}
	
	//ham in thong tin
	public String toString() {
		return "*Ma so: " + maso + "; Mau: " + mau + "; So luong moi hop: " + soluongmh +
				"; Chieu dai: " + chieudai + "; Chieu ngang: " + chieungang +
				"; Gia moi hop: " + giabanmh;
	}
	
	// gia ban le 1 vien gach
	public float giaBanLe() {
		float giamoivien = (float)((giabanmh/soluongmh) * 1.2);
		return giamoivien;
	}
	
	// dien tich lat duoc toi da cua 1 hop gach
	public int dienTichToiDa() {
		return soluongmh * chieudai * chieungang;
	}
	
	// so luong hop gach de lat dien tich D*N
	public int soLuongHop(int D, int N) {
		int soHop = Math.round((D * N)/(dienTichToiDa()));
		return soHop;
	}
	
	
}
