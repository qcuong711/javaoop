package lab5;

import java.util.Scanner;

public class KhachHang {
	
	public String cccd;
	public String hten;
	public String dchi;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String cccd, String hten, String dchi) {
		this.cccd = cccd;
		this.hten = hten;
		this.dchi = dchi;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getHten() {
		return hten;
	}

	public void setHten(String hten) {
		this.hten = hten;
	}

	public String getDchi() {
		return dchi;
	}

	public void setDchi(String dchi) {
		this.dchi = dchi;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thong tin khach hang:");
		System.out.print("Nhap CCCD: ");
		cccd = sc.next();
		System.out.print("Nhap ten: ");
		hten = sc.next();
		System.out.print("Nhap dia chi: ");
		dchi = sc.next();
	}
	
	public void in() {
		System.out.print("CCCD: " + cccd + ", ten: " + hten + ", dia chi: " + dchi);
	}
}
