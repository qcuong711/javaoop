package lab5;

import java.util.Scanner;

public class MyDate {
	private int ngay, thang, nam;
	
	public MyDate(){
		ngay = thang = nam = 1;
	}
	
	public MyDate(int ngay, int thang, int nam){
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	
	
	public void hienThi(){
		System.out.println("Ngay: " + ngay + "/" + thang + "/" + nam);
	}
	
	public boolean hopLe(){
		boolean check = false;
					   //1   2   3   4   5   6   7   8   9   10  11  12
		int maxNgay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// check nam nhuan
		if((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)){
			maxNgay[1] = 29;
		}
		
		if(ngay > 0 && thang > 0 && nam > 0 && thang < 13 && ngay <= maxNgay[thang - 1]){
			check = true;
		}
		return check;
	}
	
	public void nhapNgay(){
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
			if(!hopLe()){
				System.out.println("Nhap sai, moi nhap lai: ");
			}
		} while(!hopLe());
	}
	
	public MyDate ngayHomSau(){
		MyDate homSau = new MyDate(ngay, thang, nam);
		homSau.ngay++;
		if(!homSau.hopLe()){
			homSau.ngay = 1;
			homSau.thang++;
		}
		
		if(!homSau.hopLe()){
			homSau.thang = 1;
			homSau.nam++;
		}
		return homSau;
	}
	
	public MyDate congNgay(int n){
		MyDate kq = new MyDate(ngay, thang, nam);
		for(int i = 0; i < n; i++){
			kq = kq.ngayHomSau();
		}	
		return kq;
	}
}
