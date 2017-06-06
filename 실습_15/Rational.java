package 실습_15;

/**
 * Created by byungjuchae on 2016. 12. 14..
 */
public class Rational extends Number implements Comparable<Rational> {
    private long numerator = 0;
    private long denominator = 1;
    public Rational() {
        this(0,1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;
        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational other) {
        long tempdenominator=denominator*other.getDenominator();
        long tempnumerator = numerator*other.getDenominator() + other.getNumerator()*denominator;
        Rational newrational = new Rational(tempnumerator, tempdenominator);
        return newrational;
    }

    public Rational subtract(Rational other) {
        long tempdenominator = denominator*other.getDenominator();
        long tempnumerator = numerator*other.getDenominator() - other.getNumerator()*denominator;
        Rational newrational = new Rational(tempnumerator, tempdenominator);
        return newrational;
    }


    public Rational multiply(Rational other) {
        long tempdenominator = denominator * other.getDenominator();
        long tempnumerator = numerator * other.getNumerator();
        Rational newrational = new Rational(tempnumerator, tempdenominator);
        return newrational;
    }

    public Rational divide(Rational other) {
        long tempdenominator = denominator * other.getNumerator();
        long tempnumerator = numerator * other.getDenominator();
        Rational newrational = new Rational(tempnumerator, tempdenominator);
        return newrational;
    }

    @Override
    public String toString() {
        if(denominator==1)
            return ""+numerator;
        return numerator+"/"+denominator;
    }

    @Override
    public boolean equals(Object other) {
        if((this.subtract((Rational)other)).getNumerator()==0)
            return true;
        return false;
    }

    @Override
    public int intValue() {
        return (int)(numerator/denominator);
    }

    @Override
    public float floatValue() {
        return (float)numerator/(float)denominator;
    }

    @Override
    public long longValue() {
        return numerator/denominator;
    }

    @Override
    public double doubleValue() {
        return (double)numerator/(double)denominator;
    }

    @Override
    public int compareTo(Rational other) {
        if((int)this.subtract(other).numerator>0)
            return 1;
        if((int)this.subtract(other).numerator<0)
            return -1;
        else
            return 0;
    }
}
