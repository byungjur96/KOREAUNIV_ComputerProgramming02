package 실습_9.Lab09_2;

/**
 * Created by byungjuchae on 2016. 11. 2..
 */
public class Rectangle extends Point {
    double w,h;
    Rectangle(double initx, double inity, double initw, double inith) {
        super(initx, inity);
        w = initw;
        h = inith;
    }
    boolean isHit (Point p){
        if(p.x-x>0 && p.x-x<w && p.y-y>0 && p.y-y<h){
            return true;
        }
        else
            return false;
    }
}
