
public class Main {
	public static void main (String[] args) {
		C numere = new C(-2, 0, 2);
		
		try {
			numere.verifNeg(numere.getA(), numere.getB(), numere.getC());
		}catch (Exceptie1 e) {
			System.out.println(e.getMessage());
		}
	}
}
