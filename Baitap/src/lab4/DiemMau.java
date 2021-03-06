package lab4;

import lab2.Diem;

public class DiemMau extends Diem{
	private String mau;
	
	public DiemMau() {
		super();
		mau = "chua xac dinh";
	}
	
	public DiemMau(Diem d, String mau) {
		super(d);
		this.mau = mau;
	}
	
	public DiemMau(int x, int y, String mau) {
		super(x, y);
		this.mau = mau;
	}
	
	public void GanMau(String mau) {
		this.mau = mau;
	}
	
	@Override
	public void nhap() {
		super.nhap();
	}
	
	@Override
	public void in() {
		super.in();
		System.out.println("Mau: " + mau);
	}
}
