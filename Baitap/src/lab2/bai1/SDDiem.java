package lab2.bai1;

public class SDDiem {
public static void main(String[] args) {
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
