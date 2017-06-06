package 실습_15;

/**
 * Created by byungjuchae on 2016. 12. 14..
 */
public class Test06_1 {
    public static void main(String [] args) {
        Rational r1 = new Rational(4,2);
        Rational r2 = new Rational(2,3);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
