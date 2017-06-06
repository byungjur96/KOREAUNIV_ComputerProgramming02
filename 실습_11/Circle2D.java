package 실습_11;

/**
 * Created by byungjuchae on 2016. 11. 16..
 */
public class Circle2D {
    private Point2D center = new Point2D();
    private double radius;

    private Point2D getCenter(){
        return center;
    }

    private double getRadius(){
        return radius;
    }

    public Circle2D(){
        center = new Point2D();
        radius = 1;

    }

    public Circle2D(Point2D p, double r){
        center= new Point2D(p) ;
        radius=r;
    }

    public void move(double dx, double dy){
        center.move(dx,dy);
    }

    public double getArea() {
        double area;
        area=Math.PI*radius*radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter;
        perimeter=Math.PI*radius*2;
        return perimeter;
    }

    public boolean contains(Point2D other){
        if(center.distance(other)<=radius){
            return true;
        }
        else
            return false;
    }

    public boolean contains(double x, double y){
        if(center.distance(x, y)<=radius){
            return true;
        }
        else
            return false;
    }

    public boolean contains(Circle2D other){
        if(center.distance(other.center)<=Math.abs(other.radius-radius)){
            return true;
        }
        else
            return false;
    }

    public boolean overlaps(Circle2D other){
        if(center.distance(other.center)<other.radius+radius){
            return true;
        }
        else
            return false;
    }

}
