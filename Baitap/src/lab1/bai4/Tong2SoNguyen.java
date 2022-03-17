package lab1.bai4;

import java.util.Scanner;

public class Tong2SoNguyen {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0;
		String aStr = "", bStr = "";
		int sum = 0;
		boolean breakLoop = false;
		
		do {
			System.out.println("Nhap a:");
			aStr = sc.next();
			System.out.println("Nhap b:");
			bStr = sc.next();
			try {
				a = Integer.parseInt(aStr);
				b = Integer.parseInt(bStr);
				breakLoop = true;
			} catch (Exception e) {
				System.out.println("Sai dinh dang, moi nhap lai!");
				breakLoop = false;
			}
		} while(!breakLoop);
		
		sum = a + b;
		System.out.println("Tong la:" + sum);
	}	
}
