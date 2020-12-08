
public class A {
	private int a;
	
	public A(int a) {
		this.a = a;
	}
	
	public void verifNeg(int a) throws Exceptie1{
		if ( a < 0 )
			throw new Exceptie1("Numarul este negativ");
		else
			System.out.println("Numarul este pozitiv");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	

}
