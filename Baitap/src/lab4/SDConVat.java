package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SDConVat {
	public static void main(String[] args) {
		List<ConVat> allConVat = new ArrayList<ConVat>();
		
		System.out.print("Nhap so luong con vat muon nhap: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Con vat thu " + i + ", moi nhap 1 trong 4 loai Bo, Heo, De, Ga: ");
			String loaiConVat = sc.next();
			if(loaiConVat.equals("Bo") || loaiConVat.equals("bo")) {
				ConVat conbo = new Bo();
				conbo.nhap();
				allConVat.add(conbo);
			}
			if(loaiConVat.equals("Heo") || loaiConVat.equals("heo")) {
				ConVat conheo = new Heo();
				conheo.nhap();
				allConVat.add(conheo);
			}
			if(loaiConVat.equals("De") || loaiConVat.equals("de")) {
				ConVat conde = new De();
				conde.nhap();
				allConVat.add(conde);
			}
			if(loaiConVat.equals("Ga") || loaiConVat.equals("ga")) {
				ConVat conga = new Ga();
				conga.nhap();
				allConVat.add(conga);
			}
		}
		
		//vong lap for-each
		for(ConVat cv : allConVat) {
			cv.in();
			cv.Keu();
		}
	}
}
