package lab2;

public class SDDiem {
public static void main(String[] args) {
	Diem A = new Diem(3,4);
	System.out.println("Toa do cua A: ");
	A.in();
	
	Diem B = new Diem();
	System.out.println("Toa do cua B: ");
	B.in();
	System.out.println("Hoanh do diem B: " + B.getX());
	
	B.doiDiem(3, 5);
	System.out.println("Toa do cua B sau khi di chuyen: ");
	B.in();
	
	Diem C = new Diem(-B.getX(), -B.getY());
	System.out.println("Toa do cua C: ");
	C.in();
	System.out.println("KC C toi goc toa do: ");
	System.out.println(C.khoangCach());
	System.out.println("KC C toi goc diem A: ");
	System.out.println(C.khoangCach(A));
	
	Diem[] diem1 = new Diem[5];
	for(int i = 0; i < diem1.length; i++) {
		diem1[i] = new Diem();
		diem1[i].nhap();
	}
	
	for(int j = 0; j < diem1.length; j++) {
		diem1[j].in();
	}
}
}
