package 실습_6; /**
 * Created by byungjuchae on 2016. 10. 5..
 */
import java.util.Scanner;

public class 실습_6_3 {
    public static void main(String[] args) {
        double x1,y1, x2, y2, x3, y3;
        double side1, side2, side3;
        double s, area;
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        side1= Math.pow((Math.pow(x2-x3,2))+(Math.pow(y2-y3,2)), 0.5);
        side2= Math.pow((Math.pow(x1-x3,2))+(Math.pow(y1-y3,2)), 0.5);
        side3= Math.pow((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)), 0.5);
        s=(side1+side2+side3)/2;
        area=Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        System.out.printf("The area of the triangle is %.1f", area);
    }
}
