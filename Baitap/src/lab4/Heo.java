package lab4;

public class Heo extends ConVat {
	
	public Heo() {
		super();
	}
	
	@Override
	public void Keu() {
		System.out.println("Heo keu Ec Ec...!");
	}
	
	@Override
	public void nhap() {
		super.nhap();
	}
	
	@Override
	public void in() {
		System.out.println("Thong tin con heo:");
		super.in();
	}
}
