
public class C extends B { 
	
	private int c;
	
	public C(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	
	public void verifNeg(int a, int b, int c)throws Exceptie1{
		super.verifNeg(a, b);
		if ( c < 0 )
			throw new Exceptie3("Numarul este negativ");
		else
			System.out.println("Numarul este pozitiv");
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	

}
