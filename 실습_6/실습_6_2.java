package 실습_6;

/**
 * Created by byungjuchae on 2016. 10. 5..
 */
public class 실습_6_2 {
    public static void main(String[] args) {
        double a=3.4, b=50.2, c=2.1, d=0.55, e=44.5, f=5.9;
        double x, y;
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        System.out.printf("%f %f",x,y);
    }
}
