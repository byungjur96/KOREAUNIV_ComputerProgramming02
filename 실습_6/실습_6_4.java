package 실습_6; /**
 * Created by byungjuchae on 2016. 10. 5..
 */
import java.util.Scanner;

public class 실습_6_4 {
    public static void main(String[] args) {
        double a,b,c;
        double r1, r2, root;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        if((b*b-4*a*c)==0){
            System.out.println(-b/2*a);
        }
        else if((b*b-4*a*c)<0){
            System.out.println("The equation has no real roots.");
        }
        else{
            root=Math.pow(b*b-4*a*c,0.5);
            r1=(-b+root)/2*a;
            r2=(-b-root)/2*a;
            System.out.println("The equation has two roots"+r1+"and"+r2);
        }
    }
}
