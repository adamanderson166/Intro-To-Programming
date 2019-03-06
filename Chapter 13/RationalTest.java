import java.math.BigInteger;

public class RationalTest {
	public static void main(String[] args) {
		Rational bigRational = new Rational(new BigInteger("1"), new BigInteger("55"));
		System.out.print(bigRational);		
	}
}