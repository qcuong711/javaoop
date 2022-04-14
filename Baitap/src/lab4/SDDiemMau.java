package lab4;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "trang");
		System.out.print("Toa do diem A: ");
		A.in();
		
		DiemMau B = new DiemMau();
		System.out.print("Nhap thong tin diem B: ");
		B.nhap();
		B.in();
		B.doiDiem(10, 8);
		System.out.print("Thong tin diem B sau khi doi toa do: ");
		B.in();
		B.GanMau("vang");
		System.out.print("Thong tin diem B sau khi doi mau: ");
		B.in();
	}
}
