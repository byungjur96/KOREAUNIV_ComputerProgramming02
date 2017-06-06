package 실습_9.Lab09_2;

/**
 * Created by byungjuchae on 2016. 11. 2..
 */
public class Point {
    double x, y;
    Point(double initx, double inity) {
        x = initx;
        y = inity;
    }

    double distance (Point p){
        double result;
        result=Math.pow((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y), 0.5);
        return result;
    }


}
