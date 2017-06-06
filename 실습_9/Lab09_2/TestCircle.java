package 실습_9.Lab09_2;

/**
 * Created by byungjuchae on 2016. 11. 2..
 */

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(0, 0, 1);
        Point p1 = new Point(0.5, 0.5);
        Point p2 = new Point(1, 1);
        Circle c1 = new Circle(1, 1, 1);
        Circle c2 = new Circle(2, 2, 1);
        System.out.println(c.isHit(p1));
        System.out.println(c.isHit(p2));
        System.out.println(c.isHit(c1));
        System.out.println(c.isHit(c2));
    }
}