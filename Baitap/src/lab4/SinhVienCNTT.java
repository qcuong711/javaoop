package lab4;

import java.util.Scanner;

import lab2.Date;
import lab3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taiKhoan;
	private String matKhau;
	private String email;
	
	public SinhVienCNTT() {
		super();
		taiKhoan = "chua xac dinh";
		matKhau = "chua xac dinh";
		email = "chua xac dinh";
	}
	
	public SinhVienCNTT(String mssv, String ten, Date ngaySinh, int soMonHoc,
			 String taiKhoan, String matKhau, String email) {
		super(mssv, ten, ngaySinh, soMonHoc);
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.email = email;
	}
	
	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		super.nhapTT();
		System.out.print("Nhap tai khoan:");
		taiKhoan = sc.next();
		System.out.print("Nhap mat khau:");
		matKhau = sc.next();
		System.out.print("Nhap email:");
		email = sc.next();
	}
	
	@Override
	public String toString() {
		super.toString();
		return ", tai khoan:" + taiKhoan + ", mat khau: " + matKhau + ", email: " + email;
	}
	
	public void doiMatKhau(String newpass) {
		this.matKhau = newpass;
	}
	
}
