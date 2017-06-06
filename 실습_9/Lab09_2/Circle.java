package 실습_9.Lab09_2;

/**
 * Created by byungjuchae on 2016. 11. 2..
 */
public class Circle extends Point {
    double r;
    Circle(double initx, double inity, double initr) {
        super(initx,inity);
        r = initr;
    }

    boolean isHit(Point p){
        double dis;
        dis=Math.pow((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y), 0.5);
        if(dis<r){
            return true;
        }
        else
            return false;
    }

    boolean isHit(Circle c){
        double dis;
        dis=Math.pow((x-c.x)*(x-c.x)+(y-c.y)*(y-c.y), 0.5);
        if(dis<=r+c.r){
            return true;
        }
        else
            return false;
    }
    }
