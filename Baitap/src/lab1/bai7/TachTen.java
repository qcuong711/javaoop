package lab1.bai7;

import java.util.Scanner;

public class TachTen {
	// duyet nguoc String, khi gap khoang trang thi tach chuoi tu i+1
	public static String Ten(String hoten) {
		for(int i = hoten.length() - 1; i > 0; i--) {
			if (hoten.substring(i, i+1).equals(" ")) {
				return hoten.substring(i+1);
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap ho ten: ");
		String hovaten = sc.nextLine();
		
		if(Ten(hovaten) == null) {
			System.out.println("Ko the xac dinh ten");
		} else {
			System.out.println("Ten: " + Ten(hovaten));
		}
	}
}
