package lab2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Diem(Diem d) {
		this.x = d.getX();
		this.y = d.getY();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x:");
		x = sc.nextInt();
		System.out.println("Nhap y:");
		y = sc.nextInt();
	}
	
	public void in() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public double khoangCach() {
		double kc = 0;
		kc = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return kc;
	}
	
	public double khoangCach(Diem d) {
		double kc = 0;
		kc = Math.sqrt(Math.pow(x - d.getX(), 2) + Math.pow(y - d.getY(), 2));
		return kc;
	}

}
