package 실습_11;

/**
 * Created by byungjuchae on 2016. 11. 16..
 */
public class Point2D {
    private double x;
    private double y;

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void move(double dx, double dy){
        x+=dx;
        y+=dy;
    }

    public double distance(double x, double y){
        double dis;
        dis=Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        return dis;
    }

    public double distance(Point2D other){
        double dis;
        dis=Math.sqrt((other.x-this.x)*(other.x-this.x)+(other.y-this.y)*(other.y-this.y));
        return dis;
    }

    public Point2D() {
        x=0;
        y=0;
    }

    public Point2D(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public Point2D(Point2D p){
        this.x=p.getX();
        this.y=p.getY();
    }
}