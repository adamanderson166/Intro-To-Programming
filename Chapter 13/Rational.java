import java.math.BigInteger;
import java.math.*;

public class Rational extends Number implements Comparable<Rational> {
	// Data fields for numerator and denominator
	public BigInteger numerator = BigInteger.ZERO;
	public BigInteger denominator = BigInteger.ONE;
	
	//Construct a rational with default properties
	public Rational() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	//Construct a rational with specified numerator and denominator
	public Rational(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = numerator.gcd(denominator).abs();
		this.numerator = denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : new BigInteger("-1").multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}
	
	//Find GCD of two numbers
	public Rational(long n, long d) {
		BigInteger numerator = new BigInteger("" + n);
		BigInteger denominator = new BigInteger("" + d);
		BigInteger gcd = numerator.gcd(denominator);
		this.numerator = (((d > 0) ? new BigInteger("1") : new BigInteger("-1")).multiply(numerator).divide(gcd));
		this.denominator = (denominator.abs().divide(gcd));
	}
	
	//Return numerator
	public BigInteger getNumerator() {
		return numerator;
	}
	
	public BigInteger getDenominator() {
		return denominator;
	}
	
	// Add a rational number to this rational
	public Rational add(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getDenominator()));		
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	// Subtract a rational number to this Rational
	public Rational subtract(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	// Multiply a rational number from this Rational
	public Rational multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rational(n, d);
	}
	
	//Divide a rational number by this rational
	public Rational divide(Rational secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new Rational(n, d);
	}
	
	@Override
	public String toString() {
		if (denominator == BigInteger.ZERO) {
			return numerator + "";
		}
		else
			return numerator + "/" + denominator;
	}
	
	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((Rational)(other))).getNumerator().intValue() == 0) 
			return true;
		else 
			return false;
	}
	
	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int)doubleValue();
	}
	
	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float)doubleValue();
	}
	
	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return numerator.doubleValue() / denominator.doubleValue();
	}
	
	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long)doubleValue();
	}
	
	@Override // Implement the compareTo method in Comparable
	public int compareTo(Rational o) {
		return this.subtract(o).getNumerator().signum();
	}
}