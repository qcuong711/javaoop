package lab3.bai3;

import java.util.Date;

public class Student {
	private String mssv;
	private String hoten;
	private int slhp;
	private String[] tenhp;
	private String[] diemhp;
	
	public Student() {
		mssv = "B171xxxx";
		hoten = "unknown";
		slhp = 0;
	}
	
	public Student(String mssv, String hoten, int slhp, String[] tenhp, String[] diemhp) {
		this.mssv = mssv;
		this.hoten = hoten;
		this.slhp = slhp;
		this.tenhp = tenhp;
		this.diemhp = diemhp;
	}
	
	public void nhap() {
		
	}
}
