
public class B extends A{
	private int b;
	
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void verifNeg(int a, int b) throws Exceptie1{
		super.verifNeg(a);
		if ( b < 0)
			throw new Exceptie2("Numarul este negativ.");
		else
			System.out.println("Numarul este pozitiv");
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}
