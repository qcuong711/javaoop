package lab4;

public class Bo extends ConVat{
	
	public Bo() {
		super();
	}
	
	@Override
	public void Keu() {
		System.out.println("Bo keu Um Bo...!");
	}
	
	@Override
	public void nhap() {
		super.nhap();
	}
	
	@Override
	public void in() {
		System.out.println("Thong tin con bo:");
		super.in();
	}
}
