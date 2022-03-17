package lab1.bai5;

public class GiaiPhuongTrinh {
	public static void ptbac1(double a, double b) {	
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT bac nhat co vo so nghiem");
			} else {
				System.out.println("PT bac nhat vo nghiem");
			}
		}
		else {
			System.out.println("PT bac nhat co 1 nghiem: x = " + (-b/a));
		}
	}
	
	public static void ptbac2(double a, double b, double c) {
		double delta = (b*b) - (4*a*c);
		if (delta < 0) {
			System.out.println("PT bac hai vo nghiem");
		} else if (delta == 0) {
			System.out.println("PT bac hai co nghiem kep x = " + (-b/(2*a)));
		} else {
			System.out.println("PT bac hai co nghiem x1 = " + ((-b + Math.sqrt(delta))/(2*a)) + 
							   " va x2 = " + ((-b - Math.sqrt(delta))/(2*a)));
		}
	}
	
	public static void main(String[] args) {
		GiaiPhuongTrinh.ptbac1(4,6);
		GiaiPhuongTrinh.ptbac2(1,-8,16);
	}
}
