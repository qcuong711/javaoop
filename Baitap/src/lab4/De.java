package lab4;

public class De extends ConVat{
	
	public De() {
		super();
	}
	
	@Override
	public void Keu() {
		System.out.println("De keu Be Be...!");
	}
	
	@Override
	public void nhap() {
		super.nhap();
	}
	
	@Override
	public void in() {
		System.out.println("Thong tin con de:");
		super.in();
	}
}
