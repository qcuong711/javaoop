package lab3.bai1;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		Gach gach1 = new Gach();
		System.out.println(gach1.giaBanLe());
		System.out.println(gach1.dienTichToiDa());
		System.out.println(gach1.soLuongHop(2000, 50));
		*/
		
		System.out.print("Nhap so loai gach: ");
		int n = sc.nextInt();
		Gach[] dsGach = new Gach[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin loai gach thu " + (i+1) + ": ");
			dsGach[i] = new Gach();
			dsGach[i].nhap();
		}
		
		for(int j = 0; j < n; j++) {
			System.out.println("Thong tin loai gach thu " + (j+1) + ": \n" + dsGach[j]);
		}
		
		double[] phiMoiLoai = new double[n];
		for(int k = 0; k < n; k++) {
			phiMoiLoai[k] = (dsGach[k].getGiabanmh()) / (dsGach[k].getChieudai() * dsGach[k].getChieungang());
		}
		int min = 0;
		for(int l = 1; l < n; l++) {
			if(phiMoiLoai[l] < phiMoiLoai[min]) {
				min = l;
			}
		}
		System.out.println("Loai gach so " + (min + 1) + " co chi phi thap nhat");
		
		double[] phiMuaGach = new double[n];
		for(int m = 0; m < n; m++) {
			phiMuaGach[m] = (dsGach[m].getGiabanmh() * dsGach[m].soLuongHop(2000, 500));
		}
		System.out.println("Chi phi moi loai khi lot mot dien tich 20m x 5m la:");
		for(int t = 0; t < n; t++) {
			System.out.println("Chi phi loai gach " + (t+1) + ": " + phiMuaGach[t]);
		}
		
	}
}
