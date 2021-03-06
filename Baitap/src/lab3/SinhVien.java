package lab3;

import java.util.ArrayList;
import java.util.Scanner;

import lab2.Date;

public class SinhVien {
	private String mssv;
	private String ten;
	private Date ngaySinh;
	private int soMonHoc;
	private ArrayList<String> tenMonHoc;
	private ArrayList<String> diemMonHoc;
		
	public SinhVien(){
		mssv = "chua xac dinh";
		ten = "chua xac dinh";
		ngaySinh = new Date();
		soMonHoc = 0;
		tenMonHoc = new ArrayList<String>();
		diemMonHoc = new ArrayList<String>();
	}
	
	public SinhVien(String mssv, String ten, Date ngaySinh, int soMonHoc){
		this.mssv = mssv;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.soMonHoc = soMonHoc;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getSoMonHoc() {
		return soMonHoc;
	}

	public void setSoMonHoc(int soMonHoc) {
		this.soMonHoc = soMonHoc;
	}
	
	public void nhapTT(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap MSSV: ");
		mssv = sc.next();
		System.out.print("Nhap ten: ");
		ten = sc.next();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh.nhapNgay();
		System.out.print("Nhap so mon hoc dang ky: ");
		soMonHoc = sc.nextInt();
		System.out.println("Nhap ten cac mon hoc: ");
		
		for(int i = 0; i < soMonHoc; i++){
			System.out.print("Nhap mon thu " + (i+1));
			tenMonHoc.add(sc.next());
			
		}
		for(int j = 0; j < soMonHoc; j++){
			System.out.print("Nhap diem thu " + (j+1));
			diemMonHoc.add(sc.next());
		}
	}
	
	public String toString(){
		return "*MSSV: " + mssv + ", Ten: " + ten + ", Ngay sinh: " + ngaySinh + ", So luong HP: " + soMonHoc
				+ ", DS mon hoc: " + tenMonHoc + ", Diem mon hoc: " + diemMonHoc;
	}
	
	public double diemTB(){
		double tong = 0.0;
		for(String diem : diemMonHoc){
			if(diem.equals("A")){
				tong += 4.0;
			} else if (diem.equals("B+")){
				tong += 3.5;
			} else if (diem.equals("B")){
				tong += 3.0;
			} else if (diem.equals("C+")){
				tong += 2.5;
			} else if (diem.equals("C")){
				tong += 2.0;
			} else if (diem.equals("D+")){
				tong += 1.5;
			} else if (diem.equals("D")){
				tong += 1.0;
			} else {
				tong += 0.0;
			}
		}
		return tong/diemMonHoc.size();
		
	}
	
	public void themMonHoc(String monHoc){
		tenMonHoc.add(monHoc);
	}
	
	public void xoaMonHoc(String monHoc){
		tenMonHoc.remove(monHoc);
	}
}
